package Model.Statements;

import Model.ADTS.MyIDictionary;
import Model.ADTS.MyIHeap;
import Model.Expressions.Expression;
import Model.Program.PrgState;
import Model.Types.RefType;
import Model.Values.RefValue;
import Model.Values.Value;

public class WriteHStmt implements IStmt {
    private String var;
    private Expression exp;

    public WriteHStmt(String _v, Expression e) {
        var = _v;
        exp = e;
    }

    @Override
    public PrgState execute(PrgState state) throws Exception {
        MyIHeap<Integer, Value> heap = state.getHeap();
        MyIDictionary<String, Value> tbl = state.getSymTable();
        if (tbl.isDefined(var)) {
            Value v = tbl.get(var);
            if (v.getType() instanceof RefType) {
                RefValue ref = (RefValue) v;
                if (heap.isDefined(ref.getAddress())) {
                    Value val = exp.eval(tbl, heap);
                    RefType type = (RefType)ref.getType();
                    if (type.getInner().equals(val.getType())) {
                        heap.update(ref.getAddress(), val);
                        return state;
                    } else throw new StmtException("The type of the location is not the same as the var type ");
                } else throw new StmtException("Address not defined in heap");
            } else throw new StmtException("Var is not a RefType");
        } else throw new StmtException("The variable is not defined");
    }

    @Override
    public String toString() {
        return "wH(" + var + "," + exp.toString() + ")";
    }
}

package Model.Statements;

import Model.ADTS.MyIDictionary;
import Model.ADTS.MyIHeap;
import Model.ADTS.MyIStack;
import Model.Expressions.Expression;
import Model.Program.PrgState;
import Model.Types.BoolType;
import Model.Values.BoolValue;
import Model.Values.Value;

public class WhileStmt  implements IStmt{
    private IStmt stmt;
    private Expression exp;
    public WhileStmt(Expression e,IStmt is){
        exp=e;
        stmt=is;
    }
    @Override
    public PrgState execute(PrgState state) throws Exception {
        MyIStack<IStmt> stack=state.getExeStack();
        MyIHeap<Integer, Value> heap=state.getHeap();
        MyIDictionary<String,Value> tbl=state.getSymTable();
        Value v=exp.eval(tbl,heap);
        if(v.getType().equals(new BoolType())){
            BoolValue res=(BoolValue) v;
            if(res.getValue()){
                stack.push(this);
                stack.push(stmt);
                return null;
            }
            else{
                return null;
            }
        }
        else{
            throw new StmtException("Expression is not a bool");
        }
    }

    @Override
    public String toString() {
        return "(While("+exp.toString()+") "+stmt.toString()+")";
    }
}

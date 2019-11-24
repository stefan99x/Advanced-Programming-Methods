package Model.Statements;

import Model.ADTS.MyIDictionary;
import Model.ADTS.MyIHeap;
import Model.Expressions.Expression;
import Model.Program.PrgState;
import Model.Types.StringType;
import Model.Values.StringValue;
import Model.Values.Value;

import java.io.BufferedReader;

public class CloseRFileStmt implements IStmt {
    Expression exp;

    public CloseRFileStmt(Expression e) {
        exp = e;
    }

    @Override
    public PrgState execute(PrgState state) throws Exception {
        MyIDictionary<String, Value> symT = state.getSymTable();
        MyIDictionary<StringValue, BufferedReader> fileT = state.getFileTable();
        MyIHeap<Integer,Value> heap=state.getHeap();
        Value res = exp.eval(symT,heap);
        if (!res.getType().equals(new StringType())) {
            throw new StmtException("Not a string");
        }
        StringValue filepath=(StringValue)res;
        if(!state.getFileTable().isDefined(filepath)) {
            throw new StmtException("File does not exist");
        }
        BufferedReader file=fileT.get(filepath);
        file.close();
        fileT.remove(filepath);
        return state;
    }

    @Override
    public String toString() {
        return "close("+exp.toString()+")";
    }
}

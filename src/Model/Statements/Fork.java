package Model.Statements;

import Model.ADTS.MyIStack;
import Model.ADTS.MyStack;
import Model.Program.PrgState;

public class Fork implements IStmt {
    private IStmt stmt;
    public Fork(IStmt s){
        stmt=s;
    }
    @Override
    public PrgState execute(PrgState state) throws Exception {

        return new PrgState(new MyStack<>(),state.getSymTable().clone(),state.getOut(),state.getFileTable(),state.getHeap(),stmt);
    }

    @Override
    public String toString() {
        return "Fork("+stmt.toString()+")";
    }
}

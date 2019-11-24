package Model.Statements;

import Model.ADTS.MyIStack;
import Model.Program.PrgState;
import Model.Statements.IStmt;

public class CompStmt implements IStmt {
    private IStmt first;
    private IStmt second;

    public CompStmt(IStmt f, IStmt s) {
        first = f;
        second = s;
    }

    @Override
    public String toString() {
        return "(" + first.toString() + ";" + second.toString() + ")";
    }

    @Override
    public PrgState execute(PrgState state) {
        MyIStack<IStmt> stk = state.getExeStack();
        stk.push(second);
        stk.push(first);
        return state;
    }
}

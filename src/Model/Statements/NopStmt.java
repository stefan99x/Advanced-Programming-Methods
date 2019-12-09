package Model.Statements;

import Model.Program.PrgState;

public class NopStmt implements IStmt {
    public NopStmt() {
    }

    @Override
    public PrgState execute(PrgState state) throws Exception {
        return null;
    }

    @Override
    public String toString() {
        return "No()";
    }
}

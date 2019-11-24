package Model.Statements;

import Model.Program.PrgState;

public interface IStmt {
    PrgState execute(PrgState state) throws Exception;
}

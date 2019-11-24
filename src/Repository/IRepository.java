package Repository;

import Model.ADTS.ADTException;
import Model.Program.PrgState;

public interface IRepository {
    public PrgState getCrtPrg() throws ADTException;
    public void addPrg(PrgState prg) throws ADTException;
    void logPrgStateExec() throws Exception;
}

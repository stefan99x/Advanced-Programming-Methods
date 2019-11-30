package Repository;

import Model.ADTS.ADTException;
import Model.Program.PrgState;

public interface IRepository {
    PrgState getCrtPrg() throws ADTException;
    void addPrg(PrgState prg) throws ADTException;
    void logPrgStateExec() throws Exception;

}

package Repository;

import Model.ADTS.ADTException;
import Model.ADTS.MyList;
import Model.Program.PrgState;

public class MemRepository implements IRepository{
    MyList<PrgState> list;

    public MemRepository(){
        list=new MyList<PrgState>();
    }

    @Override
    public PrgState getCrtPrg() throws ADTException {
        return list.get(0);
    }

    @Override
    public void addPrg(PrgState prg) throws ADTException {
        list.add(prg);
    }

    @Override
    public void logPrgStateExec() throws Exception {

    }
}

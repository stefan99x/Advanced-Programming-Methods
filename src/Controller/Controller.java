package Controller;

import Model.ADTS.*;
import Model.Program.PrgState;
import Model.Statements.IStmt;
import Model.Values.RefValue;
import Model.Values.Value;
import Repository.IRepository;


import java.io.IOException;
import java.sql.Ref;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Controller {
    IRepository repo;

    public Controller(IRepository rep){
        repo=rep;
    }
    public PrgState oneStep(PrgState state) throws Exception{
        MyIStack<IStmt> stk=state.getExeStack();
        if(stk.isEmpty()) throw new ADTException("stack is empty");
        IStmt crtStmt=stk.pop();
       // System.out.println(crtStmt);
        repo.logPrgStateExec();
        return crtStmt.execute(state);
    }
    public void allStep() throws Exception{
        PrgState prg=repo.getCrtPrg();
        System.out.print(prg.toString());
        repo.logPrgStateExec();
        while(!prg.getExeStack().isEmpty()){
            oneStep(prg);
            System.out.print(prg.toString());
            repo.logPrgStateExec();
            prg.getHeap().setContents(safeGarbageCollector(
                    getAddrFromSymTable(prg.getSymTable().getContents().values()),
                    prg.getHeap().getContents()));

            // repo.logPrgStateExec();
        }
        repo.logPrgStateExec();
    }
    public void addProgram(PrgState prg) throws ADTException {
        this.repo.addPrg(prg);
    }


    private Map<Integer, Value> unsafeGarbageCollector(List<Integer> symTableAddr, Map<Integer,Value>
            heap){
        return heap.entrySet().stream()
                .filter(e->symTableAddr.contains(e.getKey()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

   private Map<Integer, Value> safeGarbageCollector(List<Integer> symTableAddr, Map<Integer,Value>
            heap){
        Map<Integer,Value> map= heap.entrySet().stream()
                .filter(e->symTableAddr.contains(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Map<Integer,Value> mcopy = new HashMap<>();
        mcopy.putAll(map);
        for(Map.Entry<Integer,Value> entry:mcopy.entrySet()){
            Integer key=entry.getKey();
            Value val=entry.getValue();
            while(val instanceof RefValue){
                RefValue ref=(RefValue) val;
                Integer addr=ref.getAddress();
                Value aux=heap.get(addr);
                map.put(addr,aux);
                val=aux;
            }
        }
        return map;
    }

    private List<Integer> getAddrFromSymTable(Collection<Value> symTableValues){
        return symTableValues.stream()
                .filter(v-> v instanceof RefValue)
                .map(v-> {RefValue v1 = (RefValue)v; return v1.getAddress();})
                .collect(Collectors.toList());
    }


}

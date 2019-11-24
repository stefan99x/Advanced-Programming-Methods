package Repository;

import Model.ADTS.*;
import Model.Program.PrgState;
import Model.Statements.IStmt;
import Model.Values.StringValue;
import Model.Values.Value;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;


public class LogRepository implements IRepository {
    MyList<PrgState> list;
    String logFilePath;

    public LogRepository(String filePath) {
        list = new MyList<PrgState>();
        logFilePath = filePath;
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
        PrintWriter logFile = new PrintWriter(new BufferedWriter(new FileWriter(logFilePath, true)));
        MyIList<Value> o = list.get(0).getOut();
        MyIDictionary<String, Value> l = list.get(0).getSymTable();
        MyIDictionary<StringValue, BufferedReader> fT = list.get(0).getFileTable();
        MyIStack<IStmt> s = list.get(0).getExeStack();
        MyIHeap<Integer,Value> h=list.get(0).getHeap();
        logFile.write("\nExe Stack:\n");
        logFile.print(s);
        logFile.write("\nSymTable:\n");
        logFile.print(l);
        logFile.write("\nOut:\n");
        logFile.print(o);
        logFile.write("\nFile table:\n");
        logFile.print(fT);
        logFile.write("\nHeap:\n");
        logFile.print(h);
        logFile.write("\n\n");
        logFile.close();
    }
}

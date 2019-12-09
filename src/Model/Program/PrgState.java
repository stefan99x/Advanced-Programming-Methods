package Model.Program;

import Model.ADTS.*;
import Model.Statements.IStmt;
import Model.Values.StringValue;
import Model.Values.Value;

import java.io.BufferedReader;

public class PrgState {
    private MyIStack<IStmt> exeStack;
    private MyIDictionary<String, Value> symTable;
    private MyIList<Value> out;
    private MyIDictionary<StringValue, BufferedReader> fileTable;
    private IStmt originalProgram;
    private MyIHeap<Integer,Value> heap;

    private int id;
    static int currentID=1;

    public PrgState(MyIStack<IStmt> exeS, MyIDictionary<String, Value> symT, MyIList<Value> ot, MyIDictionary<StringValue, BufferedReader> fT,MyIHeap<Integer,Value> hp, IStmt prg) {
        exeStack = exeS;
        symTable = symT;
        out = ot;
        originalProgram = prg;
        fileTable = fT;
        heap=hp;
        exeS.push(originalProgram);
        id=newId();
    }

    public MyIList<Value> getOut() {
        return out;
    }

    public MyIDictionary<String, Value> getSymTable() {
        return symTable;
    }

    public IStmt getOriginalProgram() {
        return originalProgram;
    }

    public MyIStack<IStmt> getExeStack() {
        return exeStack;
    }

    public MyIHeap<Integer, Value> getHeap() {
        return heap;
    }

    public MyIDictionary<StringValue, BufferedReader> getFileTable() {
        return fileTable;
    }

    @Override
    public String toString() {
        String res = "";
        res += "ID:"+getId()+"\nStack:" + exeStack.toString() + "\nSymTbl:" + symTable.toString() + "\nOut:" + out.toString() +"\nFileTable"+fileTable.toString()+"\nHeap"+heap.toString()+ "\n\n";
        return res;
    }

    public Boolean isNotCompleted(){
        return !exeStack.isEmpty();
    }

    public PrgState oneStep() throws Exception{
        if(exeStack.isEmpty()) throw new ADTException("stack is empty");
        IStmt crtStmt=exeStack.pop();
        // System.out.println(crtStmt);
        //repo.logPrgStateExec();
        return crtStmt.execute(this);
    }

    public int getId(){
        return id;
    }

    public static int newId(){
        int aux=currentID;
        currentID++;
        return aux;
    }


}

package Model.Statements;

import Model.ADTS.MyIDictionary;
import Model.ADTS.MyIHeap;
import Model.ADTS.MyIList;
import Model.Expressions.Expression;
import Model.Program.PrgState;
import Model.Values.Value;

public class PrintStmt implements IStmt{
    private Expression exp;
    public PrintStmt(Expression e){
        exp=e;
    }

    @Override
    public String toString() {
        return "print("+exp.toString()+")";
    }

    @Override
    public PrgState execute(PrgState state)throws Exception {
        MyIList<Value> list = state.getOut();
        MyIHeap<Integer,Value> heap=state.getHeap();
        MyIDictionary<String, Value> symTable = state.getSymTable();
        list.add(this.exp.eval(symTable,heap));
        return state;
    }
}

package Model.Statements;

import Model.ADTS.MyIDictionary;
import Model.ADTS.MyIHeap;
import Model.ADTS.MyIStack;
import Model.Expressions.Expression;
import Model.Program.PrgState;
import Model.Values.Value;

public class IfStmt implements IStmt {
    Expression exp;
    IStmt thenS;
    IStmt elseS;

    public IfStmt(Expression e,IStmt tS,IStmt eS){
        exp=e;
        thenS=tS;
        elseS=eS;
    }

    @Override
    public String toString() {
        return "IF ("+exp.toString()+") THEN ( " +thenS.toString()+" ) ELSE ("+elseS.toString()+")";
    }

    @Override
    public PrgState execute(PrgState state) throws Exception {
        MyIHeap<Integer,Value> heap=state.getHeap();
        MyIStack<IStmt> exeStack = state.getExeStack();
        MyIDictionary<String, Value> symTable = state.getSymTable();
        Value result = this.exp.eval(symTable,heap);
        if(!result.getValue().equals(0))
            exeStack.push(thenS);
        else
            exeStack.push(elseS);
        return state;
    }
}

package Model.Expressions;

import Model.ADTS.MyIDictionary;
import Model.ADTS.MyIHeap;
import Model.Values.Value;

public class ValueExp implements Expression {
    private Value value;

    public ValueExp(Value val) {
        value = val;
    }

    @Override
    public Value eval(MyIDictionary<String, Value> tbl, MyIHeap<Integer,Value> heap) throws ExpException {
        return value;
    }

    @Override
    public String toString() {
        return "ValueExp(" + value.toString() + ")";
    }
}

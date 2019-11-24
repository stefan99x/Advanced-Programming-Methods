package Model.Expressions;

import Model.ADTS.MyIDictionary;
import Model.ADTS.MyIHeap;
import Model.Values.Value;

public interface Expression {
    Value eval(MyIDictionary<String,Value> tbl, MyIHeap<Integer,Value> heap) throws Exception;
}

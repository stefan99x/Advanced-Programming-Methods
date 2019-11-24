package Model.ADTS;

import Model.Statements.IStmt;

public interface MyIStack<T> {
    void push(T v);
    T pop() throws ADTException;
    boolean isEmpty();
    int size();
    MyIStack<T> getStk();
    //String toString();

}

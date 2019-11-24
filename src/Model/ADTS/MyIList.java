package Model.ADTS;

public interface MyIList<T> {
    void add(T v) throws ADTException;
    void delete(T v) throws ADTException;
    int size();
    T get(int idx) throws ADTException;
}

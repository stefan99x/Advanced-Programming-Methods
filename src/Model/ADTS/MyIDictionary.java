package Model.ADTS;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public interface MyIDictionary<K,V> {
    void add(K key,V val) throws ADTException;
    void remove(K key) throws ADTException;
    void update(K key,V val) throws ADTException;
    V get(K key) throws ADTException;
    boolean isDefined(K id);
    public Map<K,V> getContents();
    public void setContents(Map<K,V> content);
}

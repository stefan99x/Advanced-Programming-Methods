package Model.ADTS;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MyDictionary<K, V> implements MyIDictionary<K, V> {
    private Map<K, V> dict;


    public MyDictionary() {
        dict = new HashMap<K,V>();
    }

    public void add(K key, V val) throws ADTException {
        if(key==null||val==null)
            throw new ADTException("Invalid data for dictionary");
        dict.put(key, val);
    }

    @Override
    public void remove(K key) throws ADTException {
        if (!dict.containsKey(key))
            throw new ADTException("Item does not exist");
        dict.remove(key);
    }

    @Override
    public void update(K key, V val) throws ADTException {
        if(key==null||val==null)
            throw new ADTException("Invalid data for dictionary");
        if (!dict.containsKey(key))
            throw new ADTException("Item does not exist");
        dict.remove(key);
        dict.put(key,val);
    }

    @Override
    public V get(K key) throws ADTException {
        if (!dict.containsKey(key))
            throw new ADTException("Item does not exist");
        return dict.get(key);
    }

    @Override
    public boolean isDefined(K id) {
        return dict.containsKey(id);
    }

    @Override
    public Map<K, V> getContents() {
        return dict;
    }

    @Override
    public void setContents(Map<K, V> content) {
        dict=content;
    }

    @Override
    public MyIDictionary<K, V> clone() {
        MyIDictionary<K,V> clone=new MyDictionary<K,V>();
        for(K key:dict.keySet()){
            try {
                clone.add(key,dict.get(key));
            } catch (ADTException e) {
                e.printStackTrace();
            }
        }
        return clone;
    }

    @Override
    public String toString() {
        String res="";
        for(K key:dict.keySet()){
            res+=key.toString()+"->"+dict.get(key).toString()+" ";
        }
        return res;
    }
}

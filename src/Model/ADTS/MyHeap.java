package Model.ADTS;

import Model.Values.Value;

import java.util.HashMap;
import java.util.Map;

public class MyHeap implements MyIHeap<Integer, Value> {
    private Map<Integer,Value> dict;
    private int firstFree;

    public MyHeap(){
        dict=new HashMap<Integer, Value>();
        firstFree=1;
    }

    @Override
    public void add(Value val)  throws ADTException{
        if(val==null)
            throw new ADTException("Invalid data for heap");
        dict.put(firstFree, val);
        firstFree++;
    }

    @Override
    public void update(Integer key, Value val) throws ADTException {
        if(key==null||val==null)
            throw new ADTException("Invalid data for heap");
        if (!dict.containsKey(key))
            throw new ADTException("Item does not exist");
        dict.remove(key);
        dict.put(key,val);
    }

    @Override
    public void remove(Integer key) throws ADTException {
        if (!dict.containsKey(key))
            throw new ADTException("Item does not exist");
        dict.remove(key);
    }

    @Override
    public Value get(Integer key) throws ADTException {
        if (!dict.containsKey(key))
            throw new ADTException("Item does not exist");
        return dict.get(key);
    }

    @Override
    public boolean isEmpty() {
        return dict.isEmpty();
    }

    @Override
    public Map<Integer, Value> getContents() {
        return dict;
    }

    @Override
    public void setContents(Map<Integer, Value> newdict) {
        dict=newdict;
    }

    @Override
    public boolean isDefined(Integer id) {
        return dict.containsKey(id);
    }

    @Override
    public int getFirstEmpty() {
        return firstFree;
    }

    @Override
    public String toString() {
        String res="";
        for(Integer key:dict.keySet()){
            res+=Integer.toString(key)+"->"+dict.get(key).toString()+" ";
        }
        return res;    }
}

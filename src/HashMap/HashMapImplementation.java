package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapImplementation implements HashMap {


    List<LinkedList<Pair>> list = new ArrayList<>(10);

    public HashMapImplementation(){

        for (int i = 0; i < 10; i++) {
            list.add(null);
        }

    }
    @Override
    public void put(Integer key, String s) {

        Pair<Integer, String> pair = new Pair<>(key, s);
        int index = hashFunction(key, 10);
        System.out.println("inserted at index: "+ index);
        LinkedList<Pair> linkedList = null;

        if(list.get(index) == null){
             linkedList = new LinkedList<>();
            linkedList.add(pair);
            list.add(index, linkedList);
        }else{
            list.get(index).add(pair);
        }

    }

    @Override
    public String get(Integer key) {
        int index = hashFunction(key, 10);
        System.out.println("getting value from index: "+index);
        LinkedList<Pair> ll = list.get(index);

        //iterate over linkedList
        for(Pair p : ll){
            if(p.getKey() == key)
                 return p.getVal().toString();
        }
        return null;
    }

    @Override
    public void delete(Integer i) {

    }

    @Override
    public int hashFunction(Integer key, int size) {
        int index = key%size;
        return index;
    }

    @Override
    public void print() {

        for(LinkedList<Pair> l : list){
            System.out.println("-------");
            System.out.println(l);
        }
    }


}

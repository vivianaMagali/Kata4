package kata4.model;
import java.util.*;


    public class Histogram <T> {
        private final Map <T,Integer> map=new HashMap<>();


        public int get(T key){
            return map.get(key);
        }

        public Set<T> keySet(){
            return map.keySet();
        }

        public void increment(T key){
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
    }


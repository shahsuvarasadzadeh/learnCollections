package l_COLLECTION_FRAMEWORK.l_MAP.TreeMap;
import java.util.Map;
import java.util.TreeMap;
public class TM_remove {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue());
        }
        map.remove(2);
        System.out.println("AFTER Remove");
        for (Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue());
        }
    }
}
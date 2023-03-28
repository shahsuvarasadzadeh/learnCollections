package l_COLLECTION_FRAMEWORK.l_MAP.l_HashMap;
import java.util.HashMap;
public class HM_methods {
    public static void main(String[] arg){
        /** insert*/
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);
        System.out.println(hashMap);
        System.out.println("---------------------------");
        /** boolean isEmpty() */
        System.out.println(hashMap.isEmpty());
        System.out.println("---------------------------");
        /** Object clone() */
        HashMap<String,Integer>hashMapCloned= (HashMap<String, Integer>) hashMap.clone();
        System.out.println(hashMapCloned);
        System.out.println("---------------------------");
        /*
        The clone() method of the HashMap class returns a shallow copy of the HashMap object.
        When the method is called, the original HashMap object is copied,
        and a new HashMap object is created.
        During this copying process, both objects have the same key-value pairs.
        This method means that changes to the original HashMap object do not affect the copied HashMap object.
        Therefore, users who want to preserve the original HashMap object can perform
        their operations by modifying the cloned object using the clone() method.
         */
        /** Set entrySet() */
        /* It is used to return a collection view of the mappings contained in this map.*/
        System.out.println(hashMap.entrySet());
        System.out.println("---------------------------");
        /** Set keySet() */
        /* It is used to return a set view of the keys contained in this map. */
        System.out.println(hashMap.keySet());
        System.out.println("---------------------------");
        /** void putAll(Map map)*/
        /* It is used to insert the specified map in the map. */
        HashMap<String,Integer>hashMap1=new HashMap<>();
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);
        System.out.println("---------------------------");
        /** putIfAbsent(K key, V value) */
        /* It inserts the specified value with the specified key in the map only if it is not already specified.*/
        hashMap.put("D",null);
        hashMap.putIfAbsent("D",4);
        hashMap.putIfAbsent("E",6);
        hashMap.putIfAbsent("A",9);
        System.out.println(hashMap);
        System.out.println("---------------------------");
        /** V remove(Object key) */
        /* It is used to delete an entry for the specified key.*/
        hashMap.remove("C");
        System.out.println(hashMap);
        System.out.println("---------------------------");
        /** boolean remove(Object key, Object value) */
        /* It removes the specified values with the associated specified keys from the map.*/
        System.out.println(hashMap1.remove("A",1));//true
        System.out.println(hashMap1.remove("B",3));//false
        System.out.println(hashMap1);
        System.out.println("---------------------------");
    }
}

package l_COLLECTION_FRAMEWORK.l_MAP.l_HashMap;

import java.util.HashMap;

public class HM_methods2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);
        /** boolean containsValue(Object value) & containsKey(Object key)*/
        /* This method returns true if some value equal to the value exists within the map, else return false.
        This method returns true if some key equal to the key exists within the map, else return false.
         */
        System.out.println(hashMap.containsValue(4));//FALSE
        System.out.println(hashMap.containsKey("A"));//TRUE
        System.out.println("----------------------------");
        /** boolean equals(Object o) */
        /* It is used to compare the specified Object with the Map.*/
        HashMap<String,Integer>hashMapCloned= (HashMap<String, Integer>) hashMap.clone();
        System.out.println(hashMap.equals(hashMapCloned));//True
        hashMapCloned.put("D",4);
        System.out.println("After add new input to hashMapCloned: "+hashMap.equals(hashMapCloned));//False
        System.out.println("----------------------------");
        /** V get(Object key) */
        /* This method returns the object that contains the value associated with the key. */
        System.out.println(hashMap.get("A"));
        System.out.println("----------------------------");
        /** int size()	*/
        /* This method returns the number of entries in the map. */
        System.out.println(hashMap.size());
        System.out.println("----------------------------");
        /** Collection<V> values()	*/
        System.out.println(hashMap.values());
    }
}

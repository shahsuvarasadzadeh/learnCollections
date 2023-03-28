package l_COLLECTION_FRAMEWORK.l_MAP.TreeMap;

import java.util.TreeMap;

public class TM_methods {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        treeMap.put("D", null);
        /** K ceilingKey(K key)  */
        /* It returns the least key, greater than the specified key or null if there is no such key. */
        System.out.println(treeMap.ceilingKey("B"));
        System.out.println("---------------------------");
        System.out.println(treeMap.ceilingEntry("D"));
        System.out.println("---------------------------");
        /** NavigableSet<K> descendingKeySet() */
        /* It returns a reverse order NavigableSet view of the keys contained in the map. */
        System.out.println(treeMap.descendingMap());
        System.out.println("---------------------------");
        /** Comparator<? super K> comparator() */
        /* It returns the comparator that arranges the key in order, or null if the map uses the natural ordering. */
        TreeMap<String, String> treeMap1 = new TreeMap<>();
        treeMap1.put("A","alma");
        treeMap1.put("B","Heyva");
        treeMap1.put("C","armud");
        System.out.println(treeMap1.comparator()); //???????
        System.out.println(treeMap.comparator());


    }
}

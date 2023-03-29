package l_COLLECTION_FRAMEWORK.l_MAP.TreeMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;
public class TM_methods {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B", 1);
        treeMap.put("A", 2);
        treeMap.put("F", 3);
        treeMap.put("D", null);
        /** K ceilingKey(K key)  */
        /* It returns the least key, greater than the specified key or null if there is no such key. */
        System.out.println(treeMap.ceilingKey("C"));
        System.out.println("---------------------------");
        /** Map.Entry<K,V> ceilingEntry(K key) */
        /* It returns the key-value pair having the least key,
        greater than or equal to the specified key, or null if there is no such key.
         */
        System.out.println(treeMap.ceilingEntry("C"));
        System.out.println("---------------------------");
        /** NavigableSet<K> descendingKeySet() */
        /* It returns a reverse order NavigableSet view of the keys contained in the map. */
        System.out.println(treeMap.descendingMap());
        System.out.println("---------------------------");
        /** Comparator<? super K> comparator() */
        /* It returns the comparator that arranges the key in order, or null if the map uses the natural ordering.
        * Eger siralama tebidirse null donderecek amma qarsiqdirsa onu NEYE GORE SIRALANMASINI geri donderecek. */
        NavigableMap<Integer, String> treeMap1
                = new TreeMap<Integer, String>(
                Collections.reverseOrder());
        treeMap1.put(1,"alma");
        treeMap1.put(2,"Heyva");
        treeMap1.put(3,"armud");
        System.out.println(treeMap1.descendingMap());
        Comparator<? super Integer> comparator = treeMap1.comparator();
        System.out.println(comparator);
        System.out.println(treeMap.comparator());
        System.out.println("---------------------------");
        /** NavigableSet<K> descendingKeySet()	*/
        /* It returns a reverse order NavigableSet view of the keys contained in the map.
        * Key deyerleri tersine geri donderecek
        */
        System.out.println(treeMap.descendingKeySet());
        System.out.println("---------------------------");
        /** Map.Entry firstEntry()	*/
        /* It returns the key-value pair having the least key.
        * EN KICIY KEY-in key -value deyerini dondurur
        */
        System.out.println(treeMap.firstEntry());
        System.out.println("---------------------------");
    }
}
package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET;

import java.util.SortedSet;
import java.util.TreeSet;

public class M_Remove {
    public static void main(String[] args) {
        SortedSet<String> str = new TreeSet<>();
        str.add("A");
        str.add("s");
        str.add("v");
        str.add("d");
        System.out.println(str);
        str.remove("A");
        // list remove metodunda hem index hem de obyekt qebul edir amma SortedSet yalniz obyekt qebul edir.
        System.out.println(str);
    }
}

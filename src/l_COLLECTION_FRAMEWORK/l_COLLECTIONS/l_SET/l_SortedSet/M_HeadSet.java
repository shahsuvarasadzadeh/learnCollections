package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET.l_SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

/** The headSet() method of SortedSet interface in Java is used
 *  to return a view of the portion of this set whose elements are strictly less than the parameter toElement. */
public class M_HeadSet {
    public static void main(String[] args) {
        SortedSet<String>strings=new TreeSet<>();
        strings.add("A");
        strings.add("C");
        strings.add("B");

        System.out.println("Elements strictly less than C in set are : "
                + strings.headSet("C"));
    }
}

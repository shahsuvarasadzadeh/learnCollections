package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET.l_SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class M_SubSet {
    public static void main(String[] args) {
        SortedSet<String>strings=new TreeSet<>();
        strings.add("A");
        strings.add("C");
        strings.add("B");
        strings.add("D");
        strings.add("E");
        strings.add("F");

        System.out.println("Elements range between A and D in set are : "
                + strings.subSet("A","F"));

        SortedSet<String>strings1=new TreeSet<>();
        strings1.add("A");
        strings1.add("C");
        strings1.add("B");
        strings1.add("D");
        strings1.add("E");
        strings1.add("F");

        System.out.println("Elements greater than or equal to D in set are : "
                + strings.tailSet("D"));
    }
}

package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET.l_SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_LastAndFirst {
    public static void main(String[] args) {
        SortedSet<String> strings=new TreeSet<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        System.out.println("first element:"+strings.first());
        System.out.println("last element:"+strings.last());


    }
}

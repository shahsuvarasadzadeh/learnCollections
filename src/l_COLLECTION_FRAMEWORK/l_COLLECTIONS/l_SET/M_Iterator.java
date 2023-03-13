package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class M_Iterator {
    public static void main(String[] args) {
        SortedSet<String> strings=new TreeSet<>();
        strings.add("A");
        strings.add("e");
        strings.add("q");
        strings.add("z");
        strings.add("b");
        strings.add("B");

        Iterator<String> str=strings.iterator();
        while (str.hasNext()){
            System.out.println(str.next());
        }
    }
}

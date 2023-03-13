package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class M_Comparator {
    public static void main(String[] args) {
        TreeSet<String>strings=new TreeSet<>();
        strings.add("Alma");
        strings.add("Heyva");
        strings.add("Armud");
        System.out.println(strings);
        Comparator comp = strings.comparator();
        System.out.println("Since the Comparator value is: "
                + comp);
    }
}

package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET.l_TreeSet;

import java.util.TreeSet;

public class M_Comparator {
    public static void main(String[] args) {
        TreeSet<String>strings=new TreeSet<>();
        strings.add("A");
        strings.add("e");
        strings.add("q");
        strings.add("z");
        strings.add("b");
        strings.add("B");
        strings.add(" ");

        // Printing elements in set before using comparator
        System.out.println("Set before using the comparator: " + strings);

        TreeSet<String> strings1 = new TreeSet<String>(new Helper());
        strings1.add("A");
        strings1.add("e");
        strings1.add("q");
        strings1.add("z");
        strings1.add("b");
        strings1.add("B");

        // Printing elements in set before using comparator
        System.out.println("The elements sorted in descending order:" + strings1);
    }
}

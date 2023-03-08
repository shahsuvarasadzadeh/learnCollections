package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_set {
    /** set(int index, E element):
     * Replaces the element at the specified position in the list with the specified element. */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Salman");
        list.add("Ali");
        list.add("Husain");
        System.out.println(list);
        System.out.println("------ After Set ------");
        list.set(1,"MuhammadAli");
        System.out.println(list);
    }
}

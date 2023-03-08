package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_clear {
    /** void clear(): Removes all the elements from the list.
     * listeki butun eleentleri silmek ucun istifade edirik */
     public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Salam");
        System.out.println(list.size());//2
        System.out.println("----- After clear -----");
        list.clear();
        System.out.println(list.size());//0
    }
}

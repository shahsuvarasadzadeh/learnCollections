package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_Remove {
    /**
     * boolean remove(Object o): Removes the first occurrence of the specified element from this list.
     * bu metodu biz her hansi bir Massivi
     * Array.asList ile liste cevirdikde isdifade ede bilmerik hemcinin add mtodunu
     * ve UnsupportedOperationException eception-nu alacayiq
     */

    public static void main(String[] args) {
        //String[] stringList = {"Alma", "Heyva", "Nar", "Armud"};
        //List<String> list1 = Arrays.asList(stringList);
        //list1.add("hello");
        //list1.remove(1)
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello1");
        list.add("hello2");
        System.out.println(list);
        System.out.println(list.remove("hello"));
        System.out.println(list.get(0));
        System.out.println(list);

    }
}

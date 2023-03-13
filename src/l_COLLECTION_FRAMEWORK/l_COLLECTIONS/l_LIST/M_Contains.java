package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_Contains {
    /** boolean contains(Object o): Returns true if this list contains the specified element. */
    public static void main(String[] args) {
        String[] stringList={"Alma","Heyva","Nar","Armud"};
        List<String> list= Arrays.asList(stringList);
        System.out.println(list.contains("Heyva"));// true
        System.out.println("---------");
        System.out.println(list.contains("Qogal")); // false
    }
}

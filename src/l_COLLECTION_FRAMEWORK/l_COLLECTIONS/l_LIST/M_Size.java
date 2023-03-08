package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.*;

public class M_Size {
/***   int size(): to get the number of elements in the list.*/
    public static void main(String[] args) {
        String[] stringList={"Alma","Heyva","Nar","Armud"};
        List<String> list=Arrays.asList(stringList);
        System.out.println(stringList);
        System.out.println("--------------");
        System.out.println(list);
        System.out.println("-------------");
        System.out.println("size of List: "+list.size());
    }
}

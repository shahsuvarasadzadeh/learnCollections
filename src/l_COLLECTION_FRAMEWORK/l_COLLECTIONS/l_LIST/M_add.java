package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_add {
    /** boolean add(E e): Appends the specified element to the end of this list.
     * verilen elementi listin sonuna elave edir */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("Salam");
        for (String s:list){
            System.out.println(s);
        }
        List<String>list1=new ArrayList<>();
        list1.add("Alma");
        list1.add("Heyva");
        list.addAll(list1);
        for (String s:list){
            System.out.print(s+",");
        }
    }
}

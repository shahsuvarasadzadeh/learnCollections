package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_retainAll {
    /** boolean retainAll(Collection<?> c):
     * Retains only the elements in this list that are contained in the specified collection.
     * Iki listimiz var A ve B isteyirikki A listimizin icerisinden B-de olmayan butun elementleri ataq ozaman
     * retainAll() metodundan istifade edirik: A.retainAll(B)*/
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("SALMAN");
        list.add("alma");
        list.add("derman");
        list.add("damla");
        List<String> list1=new ArrayList<>();
        list1.add("alma");
        list1.add("damla");
        list1.add("armud");
        list1.add("alman");

        System.out.println("list:"+list);
        System.out.println("list1:"+list1);
        System.out.println("------After retainAll--------");
        list.retainAll(list1);
        System.out.println("list:"+list);
        System.out.println("list1:"+list1);

    }
}

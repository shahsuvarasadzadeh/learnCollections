package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_subList {
    /**
     * List<E> subList(int fromIndex, int toIndex):
     * Returns a view of the portion of this list between the specified fromIndex, inclusive,
     * and toIndex, exclusive. The returned list is backed by this list,
     * so non-structural changes in the returned list are reflected in this list, and vice-versa.
     * fromIndex - daxil olaraq goturulur amma toIndex goturulmur yeni (1,3) dedikde 3-u goturmur.
     * ve her hansi bir liste deyisiklik etdikde digerinede tesir edir .
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ana");
        list.add("Ata");
        list.add("Qardas");
        list.add("Baci");
        List<String> list1 = list.subList(1, 3);
        System.out.println(list);
        System.out.println(list1);
        System.out.println("-----------");
        list.set(1, "Ana");
        System.out.println(list);
        System.out.println(list1);
    }
}

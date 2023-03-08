package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class M_sort {
 /**  We can use the following methods to sort the list:

    Using stream.sorted() method
    Using Comparator.reverseOrder() method
    Using Comparator.naturalOrder() method
    Using Collections.reverseOrder() method
    Using Collections.sort() method

  */
    public static void main(String[] args) {
        /** Using stream.sorted() method
         * It also returns a stream sorted according to the provided comparator.
         * */

        List<String>list= Arrays.asList("Alma","Armud","Heyva","Nar","Erik","Portagal");
        List<String> list1=list.stream().sorted().collect(Collectors.toList());// artiq burda collect(Collectors.toList())
        //yazmaq yerine sadece toList() yazmaq olar java onuda artiq basa duserek ozu edir
        System.out.println(list1);
        System.out.println("----------------------------------------------------------");

        /** Using Comparator.reverseOrder() method
         * The method returns a comparator that imposes the reverse of the natural ordering.
         * */
        List<Integer> rev=Arrays.asList(1,2,5,8,9,10,15,27,17,7);
        List<Integer> rev1=rev.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(rev1);
        System.out.println("----------------------------------------------------------");

        /** Java Comparator.naturalOrder()
         * The method returns a comparator that compares Comparable objects in the natural order.
         */
        List<Integer> nat=Arrays.asList(1,2,5,8,9,10,15,27,17,7);
        List<Integer> nat1=nat.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(nat1);

        /** Using Collections.reverseOrder() method
         * It returns a comparator that imposes reverse of the natural ordering.
         */
        System.out.println("----------------------------------------------------------");
        List<Integer> or=Arrays.asList(1,2,5,8,9,10,15,27,17,7);
        Collections.sort(or,Collections.reverseOrder());
        System.out.println(or);

        System.out.println("----------------------------------------------------------");

        /** Using Collections.sort() method
         * The sort() method sorts the list in ascending order,
         * according to the natural ordering of its elements.
         */
        Collections.sort(or);
        System.out.println(or);
    }
    }

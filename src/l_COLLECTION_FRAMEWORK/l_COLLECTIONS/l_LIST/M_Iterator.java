package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.Iterator;

public class M_Iterator {
    /** Iterator<E> iterator(): Returns an iterator over the elements in this list in proper sequence.
     * Iterator<E> iterator():siyahıdakı elementlər üzərində müvafiq ardıcıllıqla iteratoru qaytarır.
     * esasen hasNext() ve next() metodlarini isdifade edir.
     * hasNext()-listin sonuna catib catmamaqi yoxlayir ,
     * next()- listin bir sonraki elementi verir:
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Shahsuvar");
        arrayList.add("Raheddin");
        arrayList.add("Qismet");
        arrayList.add("Taceddin");

        Iterator<String> iterator=arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");

        arrayList.forEach(System.out::println);

        System.out.println("-------------------");

        for(String elm:arrayList){
            System.out.println(elm);
        }
    }
}

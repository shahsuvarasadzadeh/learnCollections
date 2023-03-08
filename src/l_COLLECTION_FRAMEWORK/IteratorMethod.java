package l_COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {
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

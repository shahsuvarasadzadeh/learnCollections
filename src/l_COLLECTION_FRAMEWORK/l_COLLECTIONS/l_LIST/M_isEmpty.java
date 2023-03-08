package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_isEmpty {
    /** boolean isEmpty(): to check if list is empty or not.*/
        public static void main(String[] args) {
            String[] stringList={"Alma","Heyva","Nar","Armud"};
            List<String> list= Arrays.asList(stringList);
            List<String> list1=new ArrayList<>();
            System.out.println(list.isEmpty());// false
            System.out.println("---------");
            System.out.println(list1.isEmpty()); // true
        }
    }

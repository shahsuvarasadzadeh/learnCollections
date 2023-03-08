package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_toArray {
    /** Object[] toArray(): Returns an array containing all of the elements in this list in proper sequence */
    public static void main(String[] args) {
        int j = 1;
        List<Character> list =new ArrayList<>();
        for (char i='a';i<'s';i++){
            list.add(i);
        }
        System.out.println("Alphabet");
        Object[] objects = list.toArray();
        for(Object o:objects){
            System.out.println(o);
        }
    }
}

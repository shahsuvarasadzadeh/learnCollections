package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;

public class M_get {
    /** get(int index): Returns the element at the specified position in the list.
     * gonderdiyimiz edede uygun listeki elementi bize qaytarir
     * liste olmayan bir eded verceyikse meselcun liste 4 element var biz 5-ci elementi istesek
     * ozaman IndexOutOfBoundsException istisnasini alacayiq*/
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("Salam");
        System.out.println(list.get(1));
    }
}

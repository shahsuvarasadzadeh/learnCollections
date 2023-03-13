package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET.l_SortedSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class M_toArray {
    public static void main(String[] args) {
        SortedSet<String> strings=new TreeSet<>();
        strings.add("A");
        strings.add("C");
        strings.add("D");
        strings.add("B");
        strings.add("E");
        strings.add("F");
        Object [] obj=strings.toArray();
        for (Object o:obj){
            System.out.println(o);
        }
    }
}

package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET.l_SortedSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class IteratingThroughTheSortedSet {
    public static void main(String[] args) {
        SortedSet<String> strings= new TreeSet<>();
        strings.add("A");
        strings.add("D");
        strings.add("Q");
        strings.add("W");
        strings.add("Z");
        strings.add("B");
        for (String str:strings){
            System.out.print(str+",");
        }
    }
}

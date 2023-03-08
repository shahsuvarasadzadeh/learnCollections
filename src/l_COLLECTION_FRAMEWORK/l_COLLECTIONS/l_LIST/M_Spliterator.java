package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class M_Spliterator {
    /** https://www.digitalocean.com/community/tutorials/java-spliterator*/
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        // Getting Spliterator
        Spliterator<String> namesSpliterator = names.spliterator();

        // Traversing elements
        namesSpliterator.forEachRemaining(System.out::println);
    }
}

package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET.l_TreeSet;

import java.util.Comparator;

public class Helper implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

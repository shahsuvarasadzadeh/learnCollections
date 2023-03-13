package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class CompareSetAndOthers {
    public static void main(String[] args) {
        hasSetRem();
        linkedListRem();
    }
    public static void hasSetRem() {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long startTime = System.nanoTime();
        set.remove(50000);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashSet'e 100000 eleman eklemek " + duration + " nanosaniye sürdü.");
    }
    public static void linkedListRem() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        list.remove(50000);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList'ten eleman silmek " + duration + " nanosaniye sürdü.");
    }
}

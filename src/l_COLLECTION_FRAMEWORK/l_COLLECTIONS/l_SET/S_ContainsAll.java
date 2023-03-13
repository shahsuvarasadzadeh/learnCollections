package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_SET;

import java.util.HashSet;
import java.util.Set;
/** The containsAll() method of Java Set is used to check whether two sets contain the same elements or not.
 * It takes one set as a parameter
 * and returns True if all of the elements of this set is present in the other set.
  */
public class S_ContainsAll {
        public static void main(String args[]) {

            // Creating an empty set
            Set<String> set = new HashSet<>();

            // Use add() method to
            // add elements in the set
            set.add("Geeks");
            set.add("for");
            set.add("Geeks");
            set.add("10");
            set.add("20");

            // prints the set
            System.out.println("Set 1: "
                    + set);

            // Creating another empty set
            Set<String>
                    set2 = new HashSet<String>();

            // Use add() method to
            // add elements in the set
            set2.add("for");
            set2.add("10");
            set2.add("20");
            set2.add("Geeks");

            // prints the set
            System.out.println("Set 2: "
                    + set2);
            // Check if the set
            // contains same elements
            System.out.println("\nDoes set 1 contains set 2?: "
                    + set.containsAll(set2));
        }
    }

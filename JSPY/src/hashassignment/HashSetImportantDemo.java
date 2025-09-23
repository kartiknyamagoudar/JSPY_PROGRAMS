package hashassignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetImportantDemo {
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> set = new HashSet<>();

        // 1. add()
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("After add(): " + set);

        // 2. remove()
        set.remove("Banana");
        System.out.println("After remove('Banana'): " + set);

        // 3. contains()
        System.out.println("Contains 'Apple'? " + set.contains("Apple"));

        // 4. isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());

        // 5. size()
        System.out.println("Size of set: " + set.size());

        // 6. clear()
        HashSet<String> tempSet = new HashSet<>(set); // copy for later use
        tempSet.clear();
        System.out.println("After clear(): " + tempSet);

        // 7. iterator()
        System.out.print("Using iterator(): ");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 8. toArray()
        Object[] arr = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));

        // Prepare for set operations
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Cherry");
        set1.add("Mango");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Cherry");
        set2.add("Grapes");

        // 9. addAll() -> Union
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union (addAll): " + union);

        // 10. removeAll() -> Difference
        HashSet<String> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("Difference (removeAll): " + diff);

        // 11. retainAll() -> Intersection
        HashSet<String> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        System.out.println("Intersection (retainAll): " + inter);
    }
}
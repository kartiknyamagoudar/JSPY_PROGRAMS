package hashassignment;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // add()
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Cherry");
        lhs.add("Apple"); // duplicate ignored
        System.out.println("After add(): " + lhs);

        // remove()
        lhs.remove("Banana");
        System.out.println("After remove('Banana'): " + lhs);

        // contains()
        System.out.println("Contains 'Apple'? " + lhs.contains("Apple"));

        // isEmpty()
        System.out.println("Is set empty? " + lhs.isEmpty());

        // size()
        System.out.println("Size: " + lhs.size());

        // iterator()
        System.out.print("Using iterator(): ");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // toArray()
        Object[] arr = lhs.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));

        // addAll()
        LinkedHashSet<String> more = new LinkedHashSet<>();
        more.add("Mango");
        more.add("Orange");
        lhs.addAll(more);
        System.out.println("After addAll(): " + lhs);

        // removeAll()
        lhs.removeAll(more);
        System.out.println("After removeAll(more): " + lhs);

        // retainAll()
        lhs.add("Mango");
        lhs.add("Orange");
        lhs.retainAll(more);
        System.out.println("After retainAll(more): " + lhs);

        // clear()
        lhs.clear();
        System.out.println("After clear(): " + lhs);
    }
}
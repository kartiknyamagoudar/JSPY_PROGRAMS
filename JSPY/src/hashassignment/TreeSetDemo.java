package hashassignment;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create TreeSet (Natural Sorting)
        TreeSet<Integer> ts = new TreeSet<>();

        // add()
        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(40);
        System.out.println("After add(): " + ts);

        // remove()
        ts.remove(30);
        System.out.println("After remove(30): " + ts);

        // contains()
        System.out.println("Contains 20? " + ts.contains(20));

        // size()
        System.out.println("Size: " + ts.size());

        // first() and last()
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());

        // higher() and lower()
        System.out.println("Higher than 20: " + ts.higher(20));
        System.out.println("Lower than 20: " + ts.lower(20));

        // ceiling() and floor()
        System.out.println("Ceiling of 25: " + ts.ceiling(25));
        System.out.println("Floor of 25: " + ts.floor(25));

        // headSet() and tailSet()
        System.out.println("headSet(30): " + ts.headSet(30));
        System.out.println("tailSet(30): " + ts.tailSet(30));

        // subSet()
        System.out.println("subSet(15, 45): " + ts.subSet(15, 45));

        // descendingSet()
        System.out.println("descendingSet(): " + ts.descendingSet());
    }
}
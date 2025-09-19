package finalmock;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		System.out.println(l2);
		
		l1.addAll(l2); // add all elemestd from l2 to l1
		System.out.println(l1);
		
		l1.retainAll(l2);
		System.out.println(l1);
		
		l2.remove(2);
		System.out.println(l2);
		
		System.out.println(l2.contains(60));
		
		System.out.println(l1.size());
		System.out.println(l1.get(3));
		
		Collections.sort(l1);
//		System.out.println(l1);
		
		l2.toArray();
		System.out.println(l2);
		
	}

}

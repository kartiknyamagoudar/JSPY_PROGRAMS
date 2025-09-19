package linkedlist;

import java.util.LinkedList;

public class Sapaddall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();  // it adds in index ordered
		l1.add(10);
		l1.add(90);		// add values 
		l1.add(1,50); // add values using index,value
		l1.add(60);
		l1.add(30);
		l1.add(40);
		
		System.out.println("list 1-->"+l1);
		
		LinkedList l2 = new LinkedList();  // it adds in index ordered
		l2.add(10);
		l2.add(90);		// add values 
		l2.add(1,50); // add values using index,value
		l2.add(60);
		l2.add(30);
		l2.add(40);
		System.out.println("list 2-->"+l2);
		
		l1.addAll(l2);
		System.out.println("list1 add to list2-->"+l1);
		
		l2.addAll(l1);
		System.out.println("list2 add to list1-->"+l2);

	}

}

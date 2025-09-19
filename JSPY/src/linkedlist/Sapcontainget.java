package linkedlist;

import java.util.LinkedList;

public class Sapcontainget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();  // it adds in index ordered
		l1.add(10);
		l1.add(20);		// add values 
		l1.add(30); // add values using index,value
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		System.out.println("list 1-->"+l1);
		
		LinkedList l2 = new LinkedList();  // it adds in index ordered
		l2.add(10);
		l2.add(90);		// add values 
		l2.add(1,50); // add values using index,value
		l2.add(60);
		l2.add(30);
		l2.add(40);
		System.out.println("list 2-->"+l2);
		
		System.out.println("Contains method-->"+l1.contains(50)); // return boolen if true or else false
		
		System.out.println("return based on index method-->"+l2.get(3));  // returns the value of the indexed passed
		
		System.out.println("remove method-->"+l1.remove(4));  // remove based on the index
		
		System.out.println("check if its empty list-->"+l1.isEmpty());  // return boolen value
		
		System.out.println("equals method-->"+l1.equals(l2));  // returns boolean value true if the list values are same
		
		System.out.println("convert to array-->"+l1.toArray());
	}

}

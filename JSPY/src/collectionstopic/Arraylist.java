package collectionstopic;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println("l1--->"+li);
		li.add(2,50);
		System.out.println("l1--->"+li);
		
		boolean x = li.contains(50);
		System.out.println(x);
		
		boolean y = li.contains(80);
		System.out.println(y);
		
		
		ArrayList l2 = new ArrayList();
		l2.add('A');
		l2.add('B');
		l2.add('C');
		l2.add('D');
		System.out.println("l2--->"+l2);
		
		li.addAll(l2);
		System.out.println("l1--->"+li);
		System.out.println("l2--->"+l2);

	}

}

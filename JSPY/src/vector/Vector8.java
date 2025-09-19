package vector;

import java.util.Vector;

public class Vector8 {
	public static void main(String[] args) {
		Vector<Object> v10=new Vector<Object>();
		v10.add(10);
		v10.add(20);
		v10.add(30);
		v10.add(40);
		v10.add(50);
		v10.add(60);
		v10.add(70);
		System.out.println(v10);
		v10.clear();
		System.out.println(v10);
	}

}
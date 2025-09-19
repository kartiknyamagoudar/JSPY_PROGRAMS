package vector;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<Object> v1=new Vector<Object>();
		v1.add(10);
		v1.add(20.56);
		v1.add('A');
		v1.add("hi");
		v1.add(10);
		System.out.println(v1);
	}

}
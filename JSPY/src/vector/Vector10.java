package vector;

import java.util.Vector;

public class Vector10 {
	public static void main(String[] args) {
		Vector v12=new Vector();
		v12.add(10);
		v12.add('A');
		v12.add("hi");
		v12.add(40);
		for(int i=0;i<v12.size();i++) {
			Object O1=v12.get(i);
			System.out.println(O1);
		}
		
	}

}

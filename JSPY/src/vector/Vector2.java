package vector;


import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v2=new Vector<Object>();
		v2.add(10);
		v2.add(20.56);
		v2.add('A');
		v2.add(10);
		System.out.println("b4--->"+v2);
		v2.add(1,true);
		System.out.println("a4--->"+v2);
	}

}
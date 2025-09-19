package vector;


import java.util.Vector;

public class Vector4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v4=new Vector<Object>();
		v4.add(10);
		v4.add(20);
		v4.add(30);
		v4.add(40);
		
		Vector<Object> v5=new Vector<Object>();
		v5.add('A');
		v5.add('B');
		v5.add('C');
		v5.add('D');
		
		System.out.println("******b4*******");
		System.out.println("v4-->"+v4);
		System.out.println("v5-->"+v5);
		v4.add(v5);
		System.out.println("*****a4******");
		System.out.println("v4-->"+v4);
		System.out.println("v5-->"+v5);
	}

}
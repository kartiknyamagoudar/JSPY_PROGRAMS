package vector;


import java.util.Vector;

public class Vector5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v6 = new Vector<Object>();
		
		v6.add(10);
		v6.add(20);
		v6.add(30);
		v6.add(40);
		v6.add(50);
		
		Vector<Object> v7 = new Vector<Object>();
		
		v7.add(30);
		v7.add(40);
		v7.add(50);
		v7.add(60);
		v7.add(70);
		
		System.out.println("***b4***");
		System.out.println("v6-->"+v6);
		System.out.println("v7-->"+v7);
		
		v6.retainAll(v7);
		
		System.out.println("****a4****");
		System.out.println("v6-->"+v6);
		System.out.println("v7-->"+v7);

	}

}
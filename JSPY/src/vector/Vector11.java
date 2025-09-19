package vector;

import java.util.Vector;

public class Vector11 {
	
	static int[] arr=new int[10];
	int index=0;

	public boolean add(int a)
	{
		arr[index]=a;
		index++;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v13=new Vector<Integer>();
		
		System.out.println(v13.add(10));
		System.out.println(v13.add(20));
		System.out.println(v13.add(30));
		System.out.println(v13.add(10));
		System.out.println(v13.add(20));
		System.out.println(v13.add(30));
		System.out.println(v13.add(20));
		System.out.println(v13.add(10));		
	}
	public int size()
	{
		return arr.length;
	}

}

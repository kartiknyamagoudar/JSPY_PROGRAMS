package vector;



import java.util.Vector;
public class Vector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20.56);
		v1.add('A');
		v1.add(10);
		System.out.println(v1);
		boolean x=v1.contains(45.23);
		System.out.println(x);
	}

}
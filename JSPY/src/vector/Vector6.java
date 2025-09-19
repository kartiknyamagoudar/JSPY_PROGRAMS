package vector;


import java.util.Vector;
public class Vector6 {
	public static void main(String[] args) {
		Vector v8 = new Vector();
		
		v8.add("goa");
		v8.add("banglore");
		v8.add("delhi");
		v8.add("Mandya");
		v8.add("Shivmogga");
		System.out.println("****b4*****"+v8);
		System.out.println("i got removed : "+v8.remove(2));
		System.out.println("****a4*****"+v8);
		System.out.println("i got removed: "+v8.remove("goa"));
		System.out.println("*******a4******\n"+v8);	
	}

}

package logics;

public class Reversestringwithparameter {
	public static String reverse(String name) {
		String rev="";
		for(int i=name.length()-1; i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "methodoverloading";
		System.out.println(reverse(str));
	}

}

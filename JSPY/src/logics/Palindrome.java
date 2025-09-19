package logics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cat";
		String x="";
		for(int i = s.length()-1;i>=0;i--) {
			x = x+s.charAt(i);
		}
		
//		to use case sensitive we can make use of equalsignorecase (mixture of words)
		if(s.equals(x)) {            
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}

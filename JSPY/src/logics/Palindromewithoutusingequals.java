package logics;

public class Palindromewithoutusingequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="dog";
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		int i=0;
		int j=str.length()-1;
		
		while(i < j) {
			if(ch[i] == ch[j]) {
				System.out.println(str + " is Palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println(str +" is Not a Palindrome");

	}

}

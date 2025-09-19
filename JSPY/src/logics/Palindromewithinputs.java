package logics;

import java.util.Scanner;

public class Palindromewithinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word to check palindrome");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String x1="";
		for(int i = str.length()-1;i>=0;i--) {
			x1 = x1+str.charAt(i);
		}
		if(str.equals(x1)) {            
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
	

}

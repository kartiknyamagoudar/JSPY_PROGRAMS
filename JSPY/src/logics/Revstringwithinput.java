package logics;

import java.util.Scanner;

public class Revstringwithinput {
	
	public static String reverse(String name) {
		String rev="";
		for(int i=name.length()-1; i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name to be reversed");
		String str = sc.nextLine();
		System.out.println("reversed string is");
		System.out.println(reverse(str));
		sc.close();
	}

}

package logics;

import java.util.Scanner;

public class Revwithparareturn {
	
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1; i >=0 ; i--) {
			 rev = rev+s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();	
		String output = reverse(str);
		System.out.println("reversed String is ---> "+output);
		sc.close();
	}

}

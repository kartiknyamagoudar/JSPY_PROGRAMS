package logics;

import java.util.Scanner;

public class Replacestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Book";
		System.out.println(str.replace('B','C'));
		System.out.println(str.replace('B','L'));
		System.out.println(str.replace('B','T'));
		System.out.println(str.replace('B','H'));
		
		char[] ch= {'C','L','T','H'}; // using array
		for(int i=0;i<ch.length;i++) {
			System.out.println("Using for loop we print--> "+str.replace('B',ch[i]));
		}
		
		String str1="son shines bright";
		System.out.println(str1);
		System.out.println(str1.replace("son", "sun"));
		
		String str11 = "Make";
		char[] ch1= {'F','T','B','L','W'}; // using array
		for(int i=0;i<ch1.length;i++) {
			System.out.println("Using for loop we print--> "+str11.replace('M',ch1[i]));
		}
		
	}

}

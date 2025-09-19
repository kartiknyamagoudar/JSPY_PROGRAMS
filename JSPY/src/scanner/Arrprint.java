package scanner;

import java.util.Scanner;

public class Arrprint {
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int size = sc.nextInt();
		int[] abb = new int[size];
		
		for (int i = 0; i < abb.length; i++) {
			System.out.println("enter" + i + " element");
			abb[i]=sc.nextInt();
		}
		
		printArray(abb);
		sc.close();
	}


}

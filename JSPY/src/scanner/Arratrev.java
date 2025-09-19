package scanner;

import java.util.Scanner;

public class Arratrev {
	
	static void printarray(int[] arr) {
		for (int i = arr.length - 1; i >= 0 ; i--) {
			System.out.println(arr[i]);
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int size = sc.nextInt();
		int[] abb=new int[size];
		for (int i = 0; i < abb.length; i++) {
			System.out.println("enter"+ i + " index value");
			abb[i] = sc.nextInt();
		}
		
		System.out.println("elements in array");
		printarray(abb);
		sc.close();

	}

}

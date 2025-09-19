package scanner;

import java.util.Scanner;

public class Oddsum {
	
	static void odd(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 1 ) {
				sum = sum +arr[i];
		} 
			
			
	}
		System.out.println("Sum of odd numbers = " + sum);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elemenets in array");
		int size = sc.nextInt();
		int[] abb = new int[size];
		
		for (int i = 0; i < abb.length; i++) {
			System.out.println("enter" + i + " element");
			abb[i] = sc.nextInt();
			
			}
		
		odd(abb);
		sc.close();
		}
	}


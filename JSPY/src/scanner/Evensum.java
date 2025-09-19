package scanner;

import java.util.Scanner;

public class Evensum {
	
	static void even(int[] arr) {
		
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 ==0) {
				System.out.println(arr[i]);
				sum = sum+arr[i];
			}
		}
		System.out.println("Sum of even numbers = " + sum);
		}
		
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int size = sc.nextInt();
		int[] abb = new int[size];
		for (int i = 0; i < abb.length; i++) {
			System.out.println("enter" +i+" value");
			abb[i] = sc.nextInt();
			}
		System.out.println("the value is");
		even(abb);
		sc.close();
	}
}

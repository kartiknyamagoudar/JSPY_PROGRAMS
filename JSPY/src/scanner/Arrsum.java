package scanner;

import java.util.Scanner;

public class Arrsum {
	
	static void sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];	
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elemenets");
		int size = sc.nextInt();
		int[] abb = new int[size];
		for (int i = 0; i < abb.length; i++) {
			System.out.println("enter"+ i+ "value");
			abb[i] = sc.nextInt();	
			
		}
		
		sum(abb);
		sc.close();
		}

}

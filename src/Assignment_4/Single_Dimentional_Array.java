package Assignment_4;

import java.util.Scanner;

public class Single_Dimentional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Array Size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter your Array Value");
		for (int p = 0; p < n; p++) {
			a[p] = sc.nextInt();
		}
		System.out.println("Your value id :");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}

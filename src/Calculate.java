package Assignment_1;

import java.util.Scanner;

public class Calculate {
	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println((a + b));
		System.out.println((a - b));
		System.out.println((a * b));
		System.out.println((a / b));
	}
}

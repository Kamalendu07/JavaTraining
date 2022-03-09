package Assignment_4;
import java.util.Scanner;
public class Ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array Elements in Desccending order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.println(a[i]);
		}
		System.out.println(a[n - 1]);
	}
}


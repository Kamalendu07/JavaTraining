
import java.util.Scanner;
public class Add5Numbers {

    public static void main(String[] args) {
        
        int num1, num2,num3,num4,num5, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

   	System.out.println("Enter Therd Number: ");
	num3 = sc.nextInt();
	
	System.out.println("Enter Forth Number: ");
	num4 = sc.nextInt();

	System.out.println("Enter Fifth Number: ");
	num5 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("Sum of these numbers: "+sum);
    }
}
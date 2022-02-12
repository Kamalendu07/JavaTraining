import java.util.Scanner;
public class Percentage {

public static void main(String[] args) {

	Float English,Bengali,Math,Psc,Lsc, Percentage;
	System.out.println("Taking Input From User");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter English Mark:");
	English = sc.nextFloat();

		System.out.println("Enter Bengali Mark:");
		Bengali = sc.nextFloat();
	
		System.out.println("Enter Math Mark:");
 		Math = sc.nextFloat();
	
		System.out.println("Enter Psc Mark:");
		Psc= sc.nextFloat();

		System.out.println("Enter Lsc Mark:");
		Lsc = sc.nextFloat();

		sc.close();
  		Percentage=(English + Bengali + Math + Psc + Lsc)/5;
		System.out.println("Your percentage is : ");
		System.out.println(Percentage);
	}
}
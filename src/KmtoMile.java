import java.util.Scanner;
public class KmtoMile {
public static void main(String[] args){
	double Km,Mile;
	Scanner sc = new Scanner(System.in);

	System.out.println(" Enter Km :");
	Km = sc.nextDouble();
	Mile=Km * 1.609;
	System.out.println("Mile is :" + Mile);
	}
}
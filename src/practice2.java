import java.util.Scanner;
public class practice2 {
public static void main(String[] args) {
	byte m1,m2,m3 ;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your marks in Physcis :");
	m1=sc.nextByte();

	System.out.println("Enter your marks in Mathematics :");
	m2=sc.nextByte();

	System.out.println("Enter your marks in Chemistry :");
	m3=sc.nextByte();

	float avg = (m1+m2+m3)/3.0f;
	System.out.println("Your overall percentage is: " + avg);
	if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
		System.out.println("Congratulations,You have been promoted");
		}
	else{
		System.out.println("Sorry, You are not promoted");
		}
	}
}
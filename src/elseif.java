import java.util.Scanner;
public class elseif {
public static void main(String[] args){
	int age;
	System.out.println("Enter your age");
	Scanner sc = new Scanner(System.in);
	age= sc.nextInt();
	if(age>56) {
		System.out.println("You are experience");
		}
	else if(age>40) {

		System.out.println("You are mid exprience");
		}
	else if (age>20) {
		System.out.println("You are freasher");
		}
	else  {
		System.out.println("You are a student");
		}
	}
}
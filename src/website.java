import java.util.Scanner;
public class website {
public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Website :");
	String website = sc.next();
	if(website.endsWith(".com")){
		System.out.println("This is a Commercial Website");
		}
	else if (website.endsWith(".org")){
		System.out.println("This is an Organizational Website");
		}
	else if (website.endsWith(".in")){
		System.out.println("This is an Indiaan Website");
		}

	}
}
public class Trimmed {
public static void main (String[] args) {
	
	String name = "Kamalendu";
	System.out.println(name);
	
	String nonTrimmedString= "    Sanju        ";
	System.out.println(nonTrimmedString);
	
	String trimmedString = nonTrimmedString.trim();
	System.out.println(trimmedString);
	}
}
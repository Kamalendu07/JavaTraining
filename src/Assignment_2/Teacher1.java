package Assignment_2;

public class Teacher1 {
	void teach() {
		System.out.println("Teaching subject");
	}
}

class Student extends Teacher1 {
	void listen() {
		System.out.println("Listening");
	}
}

class Principal extends Teacher1 {
	void evaluate() {
		System.out.println("Evaluating");
	}
}

class CheckForHierarchical {
	public static void main(String argu[]) {
		Principal p = new Principal();
		p.evaluate();
		p.teach();
		// p.listen(); will produce an error
	}
}

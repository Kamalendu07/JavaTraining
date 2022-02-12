package Assignment;

import java.util.*;

public class Colour {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Black");
		list.add("whight");
		list.add("Blue");
		list.add("Yellow");
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

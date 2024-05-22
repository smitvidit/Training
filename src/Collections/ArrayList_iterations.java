package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> student = new ArrayList<String>();

		student.add("a1");
		student.add("a2");
		student.add("a3");
		student.add("a4");

		// For Loop
		System.out.println("For Loop Calling");
		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i));
		}

		// For Each Loop

		System.out.println("For Each Loop Calling");
		for (String s : student) {
			System.out.println(s);
		}

		// Iterator
		System.out.println("Iterator Calling");
		Iterator<String> itr = student.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		// ListIterator

	}
}

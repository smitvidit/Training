package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> student = new ArrayList<String>();

		student.add("a1");
		student.add("a2");
		student.add("a3");
		student.add("a4");

		ArrayList<String> subject = new ArrayList<String>();

		subject.add("Maths");
		subject.add("Science");
		subject.add("Hindi");
		subject.add("English");

		System.out.println(student);
		student.addAll(subject);
		System.out.println(student);

		ArrayList<String> student1 = (ArrayList<String>) student.clone();

		System.out.println(student.contains("asdas"));

		System.out.println(student.indexOf("a2"));

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a1", "a3", "a4", "a6", "a3", "a3"));
		int abc = list1.lastIndexOf("a31");
		System.out.println(abc);
		Collections.sort(list1);

		list1.remove(1);
		System.out.println(list1);
		
		ArrayList<String> as= new ArrayList<String>();

		list1.remove("a3");
		System.out.println(list1);

		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		System.out.println(list2);

		list2.removeIf(num -> num % 2 != 0);
		System.out.println(list2);
		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		
		
		list3.retainAll(Collections.singleton(1));
		System.out.println(list3);
		

		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("a1", "a3", "a4", "a6", "a3", "a3"));
		Object arr[]=list5.toArray();
	}
}

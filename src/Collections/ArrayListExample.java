package Collections;

//import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(100);

		ArrayList<String> x = new ArrayList<String>();
		x.add("Mango");
		x.add("Orange");
		x.add("Pineapple");

		Iterator<String> itr = x.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String s : x) {

			System.out.println(x.getFirst());

		}

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("X");
		list1.add("A");
		list1.add("G");
		list1.add("K");

		System.out.println(list1);

		Collections.sort(list1);
		System.out.println(list1);
		
		ListIterator<String> ListList = list1.listIterator(list1.size());
		while(ListList.hasPrevious()) {
			String str = ListList.previous();
			System.out.println(str);
		}
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(12222);
		list2.add(123);
		list2.add(345);
		list2.add(5435);

		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);

	}

}

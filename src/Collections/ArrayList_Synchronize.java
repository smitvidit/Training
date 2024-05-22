package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList_Synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Collections.synchronizedList
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());

		namesList.add("Vidit");

		namesList.add("Patel");
		namesList.add("Mohit");
		namesList.add("Purva");
		namesList.add("Aditya");

		// add, remove - we dont need synchronizations
		// to fetch the values, we need to use the synchronizations

		synchronized (namesList) {
			Iterator<String> itr = namesList.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

		// 2. copyOnWriteArrayList ---- its a class
		CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<String>();

		list2.add("Tom");
		list2.add("Naveen");
		list2.add("Rathore");
		list2.add("Jai");

		// we dont need synchronizations
	}
}

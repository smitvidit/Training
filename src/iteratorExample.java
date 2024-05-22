import java.util.ArrayList;
import java.util.Iterator;

public class iteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);

		ArrayList<String> x = new ArrayList<String>();
		x.add("Mango");
		x.add("Orange");
		x.add("Pineapple");

		Iterator<String> itr = x.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayList_RemoveDuplicates {

	public static void main(String[] args) {

		// 1. Using LinkedHashSet

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4, 5, 23, 1, 1, 2, 3, 4, 55, 6, 7, 77));

		LinkedHashSet<Integer> a1 = new LinkedHashSet<Integer>(a);

		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);

		System.out.println(a2);
		String s = "hello";
		int i = s.lastIndexOf("");
		System.out.println(i);
		// 2. Using Stream

		String str = "Y^%^*%&*^*(&*(Pankaj";
		String cleanedStr = str.replaceAll("[^\\p{Alnum}]", "");
		System.out.println((str));

		int num = 12345;
		String rev_num = String.valueOf(num);
		StringBuilder sb = new StringBuilder(rev_num).reverse();
		Integer.parseInt(sb.toString());
		ArrayList<Integer> marks = new ArrayList<Integer>(
				Arrays.asList(1, 2, 2, 3, 4, 5, 23, 1, 1, 2, 3, 4, 55, 6, 7, 77));

		List<Integer> distinctMarks = marks.stream().distinct().collect(Collectors.toList());
		System.out.println((distinctMarks));

	}

}

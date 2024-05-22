import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 23, 22, 25, 45, 49, 68, 64);

		Collections.sort(numbers);
		int minDiff = Integer.MAX_VALUE;
		System.out.println(minDiff);

		int num1 = 0;
		int num2 = 0;

		numbers.sort(null);

		for (int i = 0; i < numbers.size() - 1; i++) {

			System.out.println("Comparing between : " + numbers.get(i) + " & " + numbers.get(i + 1));
			int diff = Math.abs(numbers.get(i) - numbers.get(i + 1));

			System.out.println("Difference is  : " + diff);
			if (diff < minDiff) {
				minDiff = diff;
				num1 = numbers.get(i);
				num2 = numbers.get(i + 1);
			}
		}

		System.out.println("Two numbers with least difference: " + num1 + ", " + num2);
		System.out.println("Minimum difference: " + minDiff);
	}

}

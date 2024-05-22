package Collections;

public class MaxMinofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int max = arr[0];
		int min = arr[0];
		for (int a : arr) {
			if (a < min) {
				min = arr[a];
			}
			if (a > max) {
				max = arr[a];
			}
		}

		System.out.println("max number is : " + max);
		System.out.println("min number is : " + min);
	}

}

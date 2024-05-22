package Collections;

class MaxMinArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5 };

		// Iterate through half of the array
		for (int i = 0; i < array.length / 2; i++) {
			// Swap elements at index i and index (length - 1 - i)
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		// Print the reversed array
		System.out.println("Reversed array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}

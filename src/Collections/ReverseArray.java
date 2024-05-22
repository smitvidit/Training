package Collections;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int length = arr.length;
		int[] rev = new int[length];
		int r = 0;
		for (int k = length - 1; k >= 0; k--) {

			// System.out.println(arr[k] + " ");
			rev[r] = arr[k];

			r++;
		}

		System.out.println(rev.length);
		for (int a : rev) {

			System.out.println(a);
		}

	}

}

package Collections;

public class ReverseArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int length = arr.length;
		int r = 0;
		int[] rev_arr = new int[length];
		for (int j = length - 1; j >= 0; j--) {
			rev_arr[r] = arr[j];
			r++;
		}
		for (int a : rev_arr) {
			System.out.println(a);
		}
	}

}

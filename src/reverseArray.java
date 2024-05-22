
public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int length1 = arr.length;
		int[] rev = new int[length1];
		int i = 0;
		for (int k = length1 - 1; k >= 0; k--) {

			rev[i] = arr[k];
			i++;
		}
		for (int r : rev) {
			System.out.println(r);
		}
	}

}

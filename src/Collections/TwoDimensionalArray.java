package Collections;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 11, 12, 13 } } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
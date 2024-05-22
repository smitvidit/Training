package Collections;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println('T' + 'e' + 'S');
		System.out.println(100 + 100 + "abc");
	
		String st = new String("hello");
		String st1 = "hello";

		if (st1 == st) {
			System.out.println("true");
		} 
		
		else if (st1.equals(st)) {
			System.out.println("true conmtenct");
		} else
			System.out.println("false");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
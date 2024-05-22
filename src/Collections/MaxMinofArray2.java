package Collections;

public class MaxMinofArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int min = arr[0];
		int max = arr[0];
		
		for(int c : arr) {
			if(c<min) {
				min = c;
				
			}
			if(c>max) {
				max = c;
			}
		}
		
		System.out.println("max is :" + max);
		System.out.println("min is :" + min);
	}

}

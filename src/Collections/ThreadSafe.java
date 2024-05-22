package Collections;

public class ThreadSafe {

	private static int a = 0;

	public static int add() {

		int tmp = a;
		tmp = tmp + 1;
		a = tmp;
		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreadSafe aa = new ThreadSafe();
		aa.add();
		System.out.println(a);

	}

}

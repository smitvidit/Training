package Collections;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "nishank";
		String reverse = reverse(original);
		System.out.println(reverse);
	}

	private static String reverse(String original) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = original.length() - 1; i >= 0; i--) {
			sb.append(original.charAt(i));
		}
		return sb.toString();
	}

}

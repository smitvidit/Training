public class tax {
	public static void main(String[] args) {
		int day = 3;
		String dayString;

		// Switch statement
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			
		case 122:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
			break;
		}

		System.out.println("Day " + day + " is " + dayString);
	}
}

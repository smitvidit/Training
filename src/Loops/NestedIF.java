package Loops;

public class NestedIF {

	public static void main(String[] args) {

int a = 85;


char grade;

if(a>90) {
	grade = 'A';
}
else if (a>80 && a<90) {
	grade = 'B';
}
else if (a>70 && a<80) {
	grade = 'B';
}
else
	grade = 'F';
		
System.out.println(grade);
		
}
}
package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int number;
			
			System.out.print("Enter a number: ");
			number = sc.nextInt();
			sc.close();
			
			if (number > 0 && number < 90) {
				System.out.print("It is an acute angle.");
			} else if (number == 90 ) {
				System.out.print("It is a right angle.");
			} else if (number > 91 && number < 180) {
				System.out.print("It is an obtuse angle.");
			} else if (number == 180) {
				System.out.print("It is a straight angle.");
			} else if (number > 180 && number < 360) {
				System.out.print("It is a reflex angle.");
			} else if (number == 360) {
				System.out.print("It is a full rotation angle.");
			}
			else {
				System.out.print("Invalid angle.");
			}
		}
		catch (InputMismatchException error) {
			System.out.print("Error: Input number only.");
		}
	}
}

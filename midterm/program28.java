package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int number;
			System.out.print("Input a number: ");
			number = sc.nextInt();	
			sc.close();
			
			if (number >= 1 && number <= 5) {
				System.out.print("Weekdays.");
			} else if (number >= 6 && number <= 7) {
				System.out.print("Weekends.");
			} else {
				System.out.print("Invalid.");
			}
		}
		catch(InputMismatchException error) {
			System.out.print("Error: Input number only.");
		}
	}
}

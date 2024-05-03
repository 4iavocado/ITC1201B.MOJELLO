package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		try {
			
			int number;
			
			System.out.print("Input any number: ");
			number = sc.nextInt();
			
			sc.close();
			
			if (number >= 1 && number <= 100) {
				System.out.print("Input is accepted.");
			} else {
				System.out.print("Input is not accepted.");
			}
		}
		catch(InputMismatchException error) {
			System.out.print("Error: Input number only.");
		}
	}
}

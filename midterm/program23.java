package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			int num;
			
			System.out.print("Enter a number: ");
			num = sc.nextInt();
			
			if(num > 0) {
				System.out.print("The number is positive.");
			} else if (num < 0) {
				System.out.print("The number is negative.");
			} else {
				System.out.print("The number is zero.");
			}
				System.out.println("\nProgram Ends.");
	
		}
		catch (InputMismatchException e) {
			System.out.print("Error: Input Number Only.");
		}
	sc.close();
	}
}

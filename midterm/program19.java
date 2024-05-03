package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int grade;
			System.out.print("Input your grade: ");
			grade = sc.nextInt();
			
			if (grade >= 75) {
				System.out.print("Congratulations! You Passed the Subject!");
			}
			System.out.print("\nProgram Ends.");
			
		}
		catch (InputMismatchException error) {
			System.out.print("Error: Input number only");
		}
	sc.close();
	}
}
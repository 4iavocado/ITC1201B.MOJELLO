package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program21 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		try {
			int grade;
			System.out.print("Input your grade: ");
			grade = sc.nextInt();
			
			if (grade >= 90) {
				System.out.print("Congratulations! Your Grade is Excellent.");
			} else if (grade >= 85) {
				System.out.print("Congratulations! Your Grade is Very Good.");
			} else if (grade >= 80) {
				System.out.print("Congratulations! Your Grade is Good.");
			} else if (grade >= 75) {
				System.out.print("Congratulations! You passed the Subject.");
			} else {
				System.out.print("Failed!");
			}
			System.out.println("\nProgram Ends.");
	
		}
		catch (InputMismatchException error) {
			System.out.print("Error: Input number only");
		}
	sc.close();
	}
}

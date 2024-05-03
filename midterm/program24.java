package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int num1, num2;
			
			System.out.print("Input first number: ");
			num1 = sc.nextInt();
			System.out.print("Input second number: ");
			num2 = sc.nextInt();
			
			sc.close();
			
			if (num1 == num2) {
				System.out.print("Inputs are equal.");
			} else if (num2 > num1) {
				System.out.print("Second number is higher than first number.");
			} else {
				System.out.print("First number is higher than second number.");
			}
		}
		
		catch(InputMismatchException error) {
			System.out.print("Error: Input number only.");
		}
	}
}

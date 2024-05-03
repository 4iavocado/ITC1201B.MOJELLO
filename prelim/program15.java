	package prelim;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int num1, num2, sum, difference, product, qoutient;
			
			System.out.print("Enter First Number: ");
			num1 = sc.nextInt();
			System.out.print("Enter Second Number: ");
			num2 = sc.nextInt();
			
			sum = num1 + num2;
			difference = num1 - num2;
			product = num1 * num2;
			qoutient = num1 / num2;
			
			System.out.println("Sum: " + sum);
			System.out.println("Difference: " + difference);
			System.out.println("Product: " + product);
			System.out.println("Qoutient: " + qoutient);
		}
		catch(InputMismatchException error) {
			System.out.println("Error: Input number only");
		}
		sc.close();
	}
}

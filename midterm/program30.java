package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int number;
			
			System.out.print("Input number from 1 to 12: ");
			number = sc.nextInt();
			
			 
			sc.close();
			
			if (number >= 1 && number <= 3) {
				System.out.print("Input is on the first quarter");
				switch (number) {
				case 1: 
					System.out.print(" and it is January.");
					break;
				case 2:
					System.out.print(" and it is February.");
					break;
				default:
					System.out.print(" and it is March.");
				}
			} else if (number >= 4 && number <= 6) {
				System.out.print("Input is on the second quarter");
				switch (number) {
				case 4: 
					System.out.print(" and it is April.");
					break;
				case 5:
					System.out.print(" and it is May.");
					break;
				default:
					System.out.print(" and it is June.");
				}
			} else if (number >= 7 && number <= 9) {
				System.out.print("Input is on the third quarter");
				switch (number) {
				case 7: 
					System.out.print(" and it is July.");
					break;
				case 8:
					System.out.print(" and it is August.");
					break;
				default:
					System.out.print(" and it is September.");
				}
			} else if (number >= 10 && number <= 12) {
				System.out.print("Input is on the last quarter");
				switch (number) {
				case 10: 
					System.out.print(" and it is October.");
					break;
				case 11:
					System.out.print(" and it is November.");
					break;
				default:
					System.out.print(" and it is December.");
				}
			}
			else {
				System.out.print("Invalid choice, input from 1 to 12 only.");
			}
		}
		catch (InputMismatchException error) {
			System.out.print("Error: Input number only.");
		}
	}
}

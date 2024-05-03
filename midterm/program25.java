package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int number;
			System.out.print("Input any number: ");
			number = sc.nextInt();
			sc.close();
			
			switch(number) {
			case 1:
				System.out.println("Equivalent day in monday.");
				break;
			case 2:
				System.out.println("Equivalent day in tuesday.");
				break;
			case 3:
				System.out.println("Equivalent day in wednesday.");
				break;
			case 4:
				System.out.println("Equivalent day in thursday.");
				break;
			case 5:
				System.out.println("Equivalent day in friday.");
				break;
			case 6:
				System.out.println("Equivalent day in saturday.");
				break;
			case 7:
				System.out.println("Equivalent day in sunday.");
				break;
				
			default: 
				System.out.println("Invalid input, input number from 1 to 7 only.");
				break;
			}
		}
		catch(InputMismatchException error) {
			System.out.print("Error: Input number only.");
		}
	}
}

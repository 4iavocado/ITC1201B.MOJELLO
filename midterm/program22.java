package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program22 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		try {
			
			int grade;
			System.out.print("Input your grade: ");
			grade = sc.nextInt();
			
			switch (grade) {
				case 100: //grade from 100-95
				case 99:
				case 98:
				case 97:
				case 96:
				case 95:
				
					System.out.println("Congratulations! Your grade is Excellent!");
				
				break;
			
				case 94: //grade from 94-85
				case 93:
				case 92:
				case 91:
				case 90:
				case 89:
				case 88:
				case 87:
				case 86:
				case 85:
					System.out.println("Congratulations! Your grade is Very Good!");
				
				break;
				
				case 84: //grade from 84-80
				case 83:
				case 82:
				case 81:
				case 80:
					System.out.println("Congratulations! Your grade is Good!");
				
				break;
				
				case 79: //grade from 79-75
				case 78:
				case 77:
				case 76:
				case 75:
					System.out.println("Congratulations! You passed the Subject!");
				
				break;
				
				default: 
					System.out.println("You failed the subject. Try again.");
			
					
			}
		}
		catch (InputMismatchException error) {
			System.out.print("Error: Input number only");
		}
	sc.close();

	}
}

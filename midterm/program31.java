package midterm;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int angle1, angle2, angle3;
			
			System.out.print("Enter first number: ");
            angle1 = sc.nextInt();
            System.out.print("Enter second number: ");
            angle2 = sc.nextInt();
            System.out.print("Enter third number: ");
            angle3 = sc.nextInt();

            int sumOfAngles = angle1 + angle2 + angle3;

            if (sumOfAngles == 180) {
                if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                    System.out.println("It is a valid acute triangle.");
                } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    System.out.println("It is a valid right triangle.");
                } else {
                    System.out.println("It is a valid obtuse triangle.");
                }
            } else {
                System.out.println("It is an invalid triangle.");
            }
        } catch (InputMismatchException error) {
            System.out.println("Invalid input. Please enter valid integer angles.");
		}
	sc.close();
	}
}



package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program49 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = 0;
            do {
                System.out.print("Input number from 1 to 7: ");
                number = sc.nextInt();
                sc.close();
            } while (number < 1 || number > 7);
            if (number >= 1 && number <= 5) {
            System.out.print("Input falls on a weekday");
            if (number == 1) {
                System.out.println(" and it is Monday.");
            }
            else if (number == 2) {
                System.out.println(" and it is Tuesday.");
            }
            else if (number == 3) {
                System.out.println(" and it is Wednesday.");
            }
            else if (number == 4) {
                System.out.println(" and it is Thursday.");
            }
            else {
                System.out.println(" and it is Friday.");
            }
        }
        else {
            System.out.println("Input falls on a weekend ");
        if (number == 6 ) {
            System.out.println(" and it is Saturday.");
        }
        else {
            System.out.println(" and it is Sunday.");
            }
        }
    }
           catch(InputMismatchException error) {
            System.out.println("Error: Input number/s only");
        }
    }
}

package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program47 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = 0;
            while (number < 1 || number > 5) {
                System.out.print("Input number from 1 to 5: ");
                number = sc.nextInt();
                sc.close();
            }
            System.out.println("Input is accepted.");
        }
        catch(InputMismatchException error) {
            System.out.println("Error: Input number/s only");
        }
    }
}

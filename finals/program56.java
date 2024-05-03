package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare the class
        MDAS m = new MDAS();
        try {
            int firstnumber, secondnumber, result, choice;
            System.out.print("Input first number: ");
            firstnumber = sc.nextInt();
            System.out.print("Input second number: ");
            secondnumber = sc.nextInt();
            do {
                System.out.println("[1]Add\n[2]Subtract\n[3]Multiply\n[4]Divide");
                System.out.print("Input choice: ");
                choice = sc.nextInt();
            } while (choice < 1 || choice > 4);
            switch (choice) {
                case 1:
                    result = m.Add(firstnumber, secondnumber);
                    break;
                case 2:
                    result = m.Subract(firstnumber, secondnumber);
                    break;
                case 3:
                    result = m.Multiply(firstnumber, secondnumber);
                    break;
                default:
                    result = m.Divide(firstnumber, secondnumber);
                    break;

            }
            System.out.println("Result: " + result);
        }
        catch(InputMismatchException error) {
            System.out.println("Error: Input number/s only");
        }
        sc.close();
    }
}


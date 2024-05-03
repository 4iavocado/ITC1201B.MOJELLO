package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program42 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        try {
           int firstnum, secondnum;

        System.out.print("First number: ");
        firstnum = sc.nextInt();
        System.out.print("Second number: ");
        secondnum = sc.nextInt();
        sc.close();

            if (firstnum > secondnum) {
                System.out.print("First number is higher than second number.");
            } else if (secondnum > firstnum) {
                System.out.print("Second number is higher than first number.");  
            } else {
                System.out.print("Both inputs are equal.");
            }
            
        }
        catch (InputMismatchException error) {
            System.out.println("Error: Input number only.");
        }
    }
}

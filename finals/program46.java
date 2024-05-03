package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program46 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        try {
            int start, end, step, ctr;
            System.out.print("Input start: ");
            start = sc.nextInt();
            System.out.print("Input end: ");
            end = sc.nextInt();
            System.out.print("Input increment/decrement: ");
            step = sc.nextInt();
            sc.close();

            if (start > end) {
                for (ctr = start; ctr >= end; ctr -= step) {
                    System.out.println(ctr);
                }
            }
            else {
                for (ctr = start; ctr <= end; ctr += step) {
                    System.out.println(ctr);
                }
            }
        }
        catch (InputMismatchException error) {
            System.out.println("Error: Input number/s only");
        }
    }
}

package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number[] = new int [5];
            int loop, sum = 0, average;
            //input

            for (loop = 0; loop < number.length; loop++) {
                System.out.print("Input number " + (loop + 1) + ": ");
                number[loop] = sc.nextInt();
        }
        for(loop = 0; loop < number.length; loop++){
            sum += number[loop];
        }
        average = sum / number.length;
        System.out.println("Sum of the " + number.length + " numbers: " + sum);
        System.out.println("Average of the " + number.length + " numbers: " + average);
    }
        catch(InputMismatchException error) {
            System.out.println("Error: Input number/s only");
        }
    sc.close();
    }
}

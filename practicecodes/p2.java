package practicecodes;
import java.util.Scanner;
import java.util.InputMismatchException;
public class p2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        try {
        char letter = ' ';
        
        System.out.print("Enter any character: ");
        letter = sc.next().charAt(0);

        System.out.println("Character entered: " + letter);

        }
        catch(InputMismatchException e) {
            System.out.println("Error: Input character only");
        }
        sc.close();
    }
}
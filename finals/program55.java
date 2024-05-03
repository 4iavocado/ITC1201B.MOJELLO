package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int random, guess, round = 1;
            
            random = (int)(Math.random() * 10) + 1;
            while(round <= 3) {
                System.out.print("Input your guess from 1 to 10: ");
                guess = sc.nextInt();
                
                if(guess == random) {
                    System.out.println("You have guessed the random number!");
                    System.out.println("Number of tries: " + round);
                    break;
                }
                round++;
            }
            System.out.println("Try again, the random number is "+ random + ".");
        }
        catch(InputMismatchException error) {
            System.out.println("Error: Input number/s only");
        }
        sc.close();
    }
}
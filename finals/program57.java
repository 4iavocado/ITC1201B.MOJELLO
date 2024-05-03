package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program57 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        try {
           int comp, user, round, cScore = 0, uScore = 0;
        
            do {
                System.out.print("Input rounds (Must be positive odd number): ");
                round = sc.nextInt();
            } while (round < 1 || round % 2 == 0);
            //ACTUAL GAME//
            while (round != 0) {
                do {
                    System.out.println("[1]Rock\n[2]Paper\n[3]Scissors");
                    System.out.print("Input your choice: ");
                    user = sc.nextInt();

                } while (user < 1 || user > 3);
                comp = (int)((Math.random() * 3) + 1);
                System.out.println("Computer choice: " + comp);
                //DETERMINE THE WINNER//
                switch (user) {
                    case 1:
                        switch (comp) {
                            case 1:
                                System.out.println("Tie!");
                                break;
                        
                            case 2:
                                System.out.println("Computer wins!");
                                cScore++;
                                round--;
                                break;
                        
                            default:
                                System.out.println("You win!");
                                uScore++;
                                round--;
                        }
                        break;
                    case 2:
                        switch (comp) {
                            case 1:
                                System.out.println("You win!");
                                uScore++;
                                round--;
                                break;
                        
                            case 2:
                                System.out.println("Tie!");
                                break;
                        
                            default:
                                System.out.println("Computer wins!");
                                cScore++;
                                round--;
                        }
                        break;
                    default:
                        switch (comp) {
                            case 1: 
                                System.out.println("Computer wins!");
                                cScore++;
                                round--;
                                break;
                            case 2:
                                System.out.println("You win!");
                                uScore++;
                                round--;
                                break;
                            default:
                                System.out.println("Tie!");
                        }
                }
                //display the score
                System.out.println("Computer score: " + cScore);
                System.out.println("Your score: " + uScore);

            }
            if (uScore > cScore) {
                System.out.println("You win!");
            }
            else {
                System.out.println("Computer wins!");
            }
        }
        catch (InputMismatchException error) {
            System.out.println("Error: Input number/s only.");
        }
        sc.close();
    }
}

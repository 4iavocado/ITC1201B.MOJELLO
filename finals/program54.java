package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int choice, quantity, total, payment;
            int fare[] = {20, 20, 15, 15, 20, 20, 20, 20, 25, 25, 30, 30};
            String station[] = {"Recto", "Legarda", "Pureza", "J. Ruiz", "Gilmore",
             "Betty Go", "Cubao", "Anonas", "Katipunan", "Santolan", 
             "Marikina", "Antipolo"};
        
            do {
                System.out.println("Welcome to LRT2 V Mapa Station");
                //display 12 stations
                System.out.print("\nInput Choice: ");
                choice = sc.nextInt();

            } while (choice < 1 || choice > 12);
            System.out.println("Selected station: " + station[choice - 1]);
            System.out.println("Fare: Php. " + fare[choice - 1]);
            System.out.print("Input number of tickets: ");
            quantity = sc.nextInt();
            total = fare[choice - 1] * quantity;

            while (total > 0) {
                System.out.println("Remaining balance: Php. " + total);
                System.out.print("Input payment of Php. 1, 5, 10, 20, 50, and 100 only: ");
                payment = sc.nextInt();
                if (payment == 1 || payment == 5 || payment == 10 || payment == 20 || payment == 50 || payment == 100) {
                    total -= payment;
                }
            }
            if (total < 0) {
                total *= -1;
            }
            System.out.println("Change: Php. " + total);
        }
        catch(InputMismatchException error) {
            System.out.println("Error: Input number/s only");
            }
        sc.close();
    }
}





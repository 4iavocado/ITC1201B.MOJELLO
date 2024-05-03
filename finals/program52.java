package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    try {
    int choice, fare, quantity, total, payment;
    String station;
    
    do {
        System.out.println("Welcome to LRT2 V.Mapa Station");
        System.out.println("1: Recto Station\n2: Legarda Station\n3: Pureza Station\n4: J. Ruiz Station\n5: Gilmore Station\n6: Betty Go Station\n7: Cubao Station\n8: Anonas Station\n9: Katipunan Station\n10: Santolan Station\n11: Marikina Station\n12: Antipolo Station");
        
        //Display 12 stations
        System.out.print("\nInput Choice: ");
        choice = sc.nextInt();

    } while (choice < 1 || choice > 12);
    
    if (choice == 1) {
        station = "Recto Station";
        fare = 20;
    }
    else if (choice == 2) {
        station = "Legarda Station";
        fare = 20;
    }
    else if (choice == 3) {
        station = "Pureza Station";
        fare = 15; 
    }
    else if (choice == 4) {
        station = "J Ruiz Station";
        fare = 15;
    }
    else if (choice == 5) {
        station = "Gilmore Station";
        fare = 20;
    }
    else if (choice == 6) {
        station = "Betty Go Station";
        fare = 20;
    }
    else if (choice == 7) {
        station = "Cubao Station";
        fare = 20;
    }
    else if (choice == 8) {
        station = "Anonas Station";
        fare = 20;
    }
    else if (choice == 9) {
        station = "Katipunan Station";
        fare = 25;
    }
    else if (choice == 10) {
        station = "Santolan Station";
        fare = 25;        
    }
    else if (choice == 11) {
        station = "Marikina Station";
        fare = 30;
    }
    else if (choice == 12) {
        station = "Antipolo Station";
        fare = 30;
    } else {
        station = "Antipolo Station";
        fare = 30;
        }
        System.out.println("You have selected " + station + ".");
        System.out.println("Fare: Php. " + fare + ".");
        System.out.print("Input ticket quantity: ");
        quantity = sc.nextInt();

        total = quantity * fare;

        System.out.println("Total Fare: Php. " + total + ".");

        while (total > 0) {
            System.out.println("Remaining balance: " + total + ".");
            System.out.print("Input payment of Php. 1, 5, 10, 20, 50, and 100: ");
            payment = sc.nextInt();

            if (payment == 1 || payment == 5 || payment == 10 || payment == 20 || payment == 50 || payment == 100) {
                total -= payment;
        }
        if(total < 0) {
            total = -1;
        }

        System.out.println("Change: Php. " + total + ".");
    }
}
        catch(InputMismatchException error) {
        System.out.println("Error: Input number/s only");
        }
        sc.close();
    }
}

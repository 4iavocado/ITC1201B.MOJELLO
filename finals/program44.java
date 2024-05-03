package finals;
import java.util.Scanner;
public class program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = 0;

        do {
            System.out.print("Input number from 1 to 7: ");
            number = sc.nextInt();
        } while (number < 1 || number > 7);

        if (number >= 1 && number <= 5) {
            System.out.print("Input falls on a weekdays");
            if (number==1) {
                System.out.println(" and it is Monday.");
            } else if (number==2) {
                System.out.println(" and it is Tuesday.");
            } else if (number==3) {
                System.out.println(" and it is Wednesday.");
            } else if (number==4) {
                System.out.println(" and it is Thursday.");
            } else {
                System.out.println(" and it is Friday.");
            }
        } else {
            System.out.print("Input falls on a weekends");
            if (number==6) {
                System.out.println(" and it is Saturday.");
            } else {
                System.out.println(" and it is Sunday.");
            }
            
        }
        sc.close();
    }
}

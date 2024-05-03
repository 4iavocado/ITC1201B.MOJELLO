package finals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program45 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        try {
            int day;
            boolean vacation;
            System.out.print("Input any number from 1 to 7: ");
            day = sc.nextInt();
            System.out.print("Are you on vacation? (true/false): ");
            vacation = sc.nextBoolean();
            sc.close();
            
            if (day >= 1 && day <= 5) {
                if (vacation == true) {
                    System.out.println("It is a weekday and you are on vacation, alarm will be at 10am.");
                
            }
            else {
                System.out.println("It is a weekday and you are not on vacation, alarm will be at 7am.");
            }
        }
        else if (day == 6 || day == 7) {
            if (vacation == false) {
                System.out.println("It is a weekend and you are not on vacation, alarm will be at 10am.");
            }
            else {
                System.out.println("It is a weekend and you are on vacation, alarm will be off.");
            }
        } else {
            System.out.println("Error: Input number from 1 to 7 only.");
        }
    }
    catch(InputMismatchException error) {
        System.out.println("Error: Input number/s only");
        }
    }
}

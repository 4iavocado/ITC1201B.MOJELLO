package practicecodes;
import java.util.Scanner;
import java.util.InputMismatchException;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age;
            System.out.print("Enter your age: ");
            age = sc.nextInt();

            if(age >= 18) {
                System.out.println("You are eligible to vote.");
            }else {
                System.out.println("You are not eligible to vote!");
            }
        }
        catch(InputMismatchException error) {
            System.out.println("Error: Input number/s only");
        }
    sc.close();
    }
}

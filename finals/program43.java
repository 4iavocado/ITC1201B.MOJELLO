package finals;
import java.util.Scanner;
public class program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number;

        System.out.print("Input number higher than 0: ");

        if (sc.hasNextInt()) {
            number = sc.nextInt();
            sc.close();
            if(number <= 0) {
                System.out.println("Error: Input number higher than 0.");
            }
            else {
                for(int i = 1; i <= 10; i++) {
                    int answer = number * i;
                    System.out.println(number + " x " + i + " = " + answer);
                    }
                }
            } 
            else {
            System.out.println("Error: Input number only.");
        }
    }
}

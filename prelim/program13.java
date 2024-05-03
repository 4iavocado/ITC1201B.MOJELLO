package prelim;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class program13 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num1, num2, sum, difference, product, qoutient;
			
			System.out.print("Enter First Number: ");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("Enter Second Number: ");
			num2 = Integer.parseInt(br.readLine());
			
			sum = num1 + num2;
			difference = num1 - num2;
			product = num1 * num2;
			qoutient = num1 / num2;
			
			System.out.println("Sum: " + sum);
			System.out.println("Difference: " + difference);
			System.out.println("Product: " + product);
			System.out.println("Qoutient: " + qoutient);
				
		}
		catch (IOException error) {
			System.out.println(error.getMessage());
		}
	}
}

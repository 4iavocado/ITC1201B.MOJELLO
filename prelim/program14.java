package prelim;
import javax.swing.JOptionPane;
public class program14 {

	public static void main(String[] args) {
		try {
			int num1, num2, sum, difference, product, qoutient;
			String msg;
			
			num1 = Integer.parseInt(JOptionPane.showInputDialog("First Number: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Second Number: "));
			
			sum = num1 + num2;
			difference = num1 - num2;
			product = num1 * num2;
			qoutient = num1 / num2;
			
			msg = "First number: " + num1 + "\nSecond number: " + num2 + "\nSum: " + sum +
			"\nDifference: " + difference + "\nProduct: " + product + "\nQoutient: " + qoutient;
			JOptionPane.showMessageDialog(null, msg);
		}
		catch (NumberFormatException error) {
			System.out.println("Error:" + error.getMessage());
		}
	}
}

package prelim;
import javax.swing.JOptionPane;
public class program17 {

	public static void main(String[] args) {
		
		try {
			String msg;
			double adjacent, hypotenuse, opposite, height, area, perimeter, sine,
			cosine, tangent;
			
			adjacent = Double.parseDouble(JOptionPane.showInputDialog("Input adjacent: "));
			hypotenuse = Double.parseDouble(JOptionPane.showInputDialog("Input hypotenuse: "));
			opposite = Double.parseDouble(JOptionPane.showInputDialog("Input opposite: "));
			height = Double.parseDouble(JOptionPane.showInputDialog("Input height: "));
			
			
			area = (opposite * height) / 2;
			perimeter = (adjacent + hypotenuse) + opposite;
			sine = opposite / hypotenuse;
			cosine = adjacent / hypotenuse;
			tangent = opposite / adjacent;
			
			msg = "Adjacent side: " + String.format("%.2f", adjacent) + 
					"\nHypotenuse side: " + String.format("%.2f", hypotenuse) +
					"\nOpposite side: " + String.format("%.2f", opposite) +
					"\nHeight side: " + String.format("%.2f", height) +
					"\nArea: " + String.format("%.2f", area) +
					"\nPerimeter: " + String.format("%.2f", perimeter) +
					"\nSine: " + String.format("%.2f", sine) +
					"\nCosine: " + String.format("%.2f", cosine) +
					"\nTangent: " + String.format("%.2f", tangent);
			
			JOptionPane.showMessageDialog(null, msg);
				}
	catch(NumberFormatException error) {
		System.out.print("Error:" + error.getMessage());
		}
	}
}

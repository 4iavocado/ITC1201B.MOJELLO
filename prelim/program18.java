package prelim;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			
			double adjacent, hypotenuse, opposite, height, area, perimeter, sine,
			cosine, tangent;
			
			System.out.print("Input adjacent side: ");
			adjacent = sc.nextFloat();
			System.out.print("Input hypotenuse side: ");
			hypotenuse = sc.nextFloat();
			System.out.print("Input opposite side: ");
			opposite = sc.nextFloat();
			System.out.print("Input height: ");
			height = sc.nextFloat();
			
			area = (opposite * height) / 2;
			perimeter = adjacent + hypotenuse + opposite;
			sine = opposite / hypotenuse;
			cosine = adjacent / hypotenuse;
			tangent = opposite / adjacent;
			
			System.out.print("Area of the triangle:" + String.format("%.2f", area));
			System.out.print("\nPerimeter of the triangle:" + String.format("%.2f", perimeter));
			System.out.print("\nSine: " + String.format("%.2f", sine));
			System.out.print("\nCosine: " + String.format("%.2f", cosine)); 
			System.out.print("\nTangent: " + String.format("%.2f", tangent));
		sc.close();
		}
		
		catch (InputMismatchException error) {
			System.out.print("Error: Input Number Only");
		}
	}
}


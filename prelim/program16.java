package prelim;
import java.util.Scanner;
import java.util.InputMismatchException;
public class program16 {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			
			float adjacent, hypotenuse, oppositeSides, height,
			area, perimeter, sine, cosine, tangent;
			
			System.out.print("Enter the Adjacent of the Triangle: ");
			adjacent = sc.nextFloat();
			System.out.print("Enter the Hypotenuse of the Triangle: ");
			hypotenuse = sc.nextFloat();
			System.out.print("Enter the Opposite Sides of the Triangle: ");
			oppositeSides = sc.nextFloat();
			System.out.print("Enter the Height of the Triangle: ");
			height = sc.nextFloat();
			
			area = (oppositeSides * height) / 2;
			perimeter = (adjacent + hypotenuse) + oppositeSides;
			sine = oppositeSides / hypotenuse;
			cosine = adjacent / hypotenuse;
			tangent = oppositeSides / adjacent;
			
			System.out.println("\nArea: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Sine: " + sine);
			System.out.println("Cosine: " + cosine);
			System.out.println("Tangent: " + tangent);
			sc.close();
			
		}
		catch(InputMismatchException error) {
			System.out.print("Error: Input Number Only");
		}
	}
}

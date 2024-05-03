package prelim;
import java.util.Scanner;
public class program12 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Input your name: ");
		name = sc.nextLine();
		
		System.out.print("Hello, " + name);
		
		sc.close();
	}
}

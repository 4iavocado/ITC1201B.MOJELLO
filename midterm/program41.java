package midterm;

public class program41 {
    public static void main(String[] args) {
		int number = 1;
		int increment = 1;
		
		for(int i = 0; i <= 10 ; i++ ) {
			System.out.print(number + ",");
			number += increment;
			increment++;
		}
		System.out.println();
		System.out.print("Program Ends.");
	}
}

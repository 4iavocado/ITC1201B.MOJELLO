package prelim;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class program10 {
    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        try {
			String name;
			System.out.print("Input the name: ");
			name = br.readLine();
			System.out.println("Hello, " + name);
		}
        catch (IOException error) {
        	System.out.println(error.getMessage());
        	
        }
	}
}

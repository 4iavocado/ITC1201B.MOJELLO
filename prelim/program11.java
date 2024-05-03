package prelim;
import javax.swing.JOptionPane;
public class program11 {
    public static void main(String[] args) {
		String name;
		
		name = JOptionPane.showInputDialog("Input your name: ");
		
		JOptionPane.showMessageDialog(null, "Hello, " + name);

	}
}

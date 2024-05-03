package finals;

public class program51 {
    public static void main(String[] args) {
        
        int row, col, print = 5;
        
        for (row = print; row >= 1; row--){
            for (col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

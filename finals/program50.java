package finals;

public class program50 {
    public static void main(String[] args) {
        
        int row, col, print = 5;
        
        for(row = 1; row <= print; row ++)
        {
            for (col = 1; col <= row; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

}


import java.util.Scanner;

public class LetterJWithStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Rows : ");
        int n = sc.nextInt();

         for ( int row = 1; row<=n; row++){
            for (int col=1; col<=n; col++){

            // top line of J
            if(row==1 || (col==n && row<n ) || (row==n && col>1 && col<n ) || (row==n-1 && col==1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }System.out.println("");
        
    }
    }
}

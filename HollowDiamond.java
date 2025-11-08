
import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num of rows : ");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(col==3 && (row==1 || row ==n) || (col==2 || col==4 ) && (row==2 || row==4) || (col==1 || col==n) && row==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
    }
}

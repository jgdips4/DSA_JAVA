import java.util.Scanner;
public class GrtOfTwoNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num (a) :");
        int a = sc.nextInt();

        System.out.print("Enter the value of second num (b) :");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("A is greater than B");
        }else{System.out.println("B is greater than A");}
        sc.close();
    }
}
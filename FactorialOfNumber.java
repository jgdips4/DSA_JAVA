import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate factorial: ");
        int n = sc.nextInt(); 
       int factorial = 1;

        if (n<0){
            System.out.print("Please Enter positive number");
        }else{
            for(int i=1; i<=n; i++){
                factorial *= i;
            }System.err.println("factorial of " + n+ " is : "+ factorial);
        }sc.close();
    }
}

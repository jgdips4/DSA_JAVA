import java.util.Scanner;

public class IfNumberIsPrime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The num to check that it is prime or not : ");
        int n = sc.nextInt();
        sc.close();
        
         boolean isPrime = true;

        if(n < 1){
            isPrime = false;
        }else{
            for(int i =2; i<=n/2; i++){
                if(n%i==0){
                     isPrime = false;
                     break;
                }
            }
        }


        if(isPrime){ 
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
    }
}
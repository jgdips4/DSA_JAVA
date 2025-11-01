import java.util.Scanner;

public class SumOfEvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd=0;
        System.out.print("How many number you want to add : ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print("Enter the num :");
            int num = sc.nextInt();
            if (num%2==0){
                even += num;
            }else{
                odd +=num;
            }
            
        }

        System.out.println("\nSum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);

        sc.close();
    }
}

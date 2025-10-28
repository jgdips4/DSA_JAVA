
import java.util.Scanner;

public class AvgOf25Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = 0; 
        float sum = 0;
        while (n<25) {
            System.err.print("Enter Marks: ");
             float mark = sc.nextFloat();
             sum = sum+ mark;
             n++;
        }

        float avg = sum/(n);
        System.out.println("Average of marks is " + avg);
        sc.close();
    }
}

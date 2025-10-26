import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value of Radius : ");
        float radius = sc.nextFloat();

        float area = (radius * radius) * (3.15f);

        System.out.println("Area of circle with" + radius + "is : " + area);

        sc.close();
    }
}

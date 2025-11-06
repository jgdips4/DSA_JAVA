import java.util.*;
public class IsPalindrome {
    
public static boolean isPalindrome(int num){
    int original = num;
    int resverse = 0;
    while(num>0){
       int digit =  num%10;
        resverse = resverse * 10 + digit;
        num = num / 10;
    }return original==resverse;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num to check : ");

    int num = sc.nextInt();

    if(isPalindrome(num)){
        System.out.println(num + " is a palindrome");
    }else{
        System.out.println(num + " is not a palindrome");
    }
}
}

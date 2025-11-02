public class SwapTwoNumber {
    public static void main(String[] args) {
        int x = 5 , y = 7; 
        System.out.println("Old Value of X is : " + x + "\nOld value of y is : " + y);
        x= x + y; 
        y = x-y; 
        x = x-y; 
        
        System.out.println("New Value of X is : " + x + "\nNew value of y is : " + y);
    }
}

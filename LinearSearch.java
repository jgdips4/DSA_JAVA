

public class LinearSearch {

    public static boolean  linearSearch(int arr[], int n, int target){

        for(int i = 0; i<=n-1; i++){
            if(arr[i]==target) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int [] arr={30, 40 ,32, 45, 06, 77};
        int n = arr.length;

        boolean search = (linearSearch(arr, n , 32));
        System.out.println(search);
    }
    
}

public class BinarySearch {

    public static boolean binarySearch(int arr[], int n , int target){
        int lo= 0;
        int hi = n-1;

        while (lo<=hi) { 
            int mid = (lo + hi)/ 2;
            if(arr[mid]<target){

                // right hand search 
                lo = mid +1;
            }
            else if (arr[mid]> target){
                hi = mid-1;
            }else {
                return true;
            };
        }return false;
    }
    public static void main(String[] args) {
        int [] arr = {22, 45, 67, 78, 89, 90};
        int n = arr.length;

        boolean search1 = binarySearch(arr, n, 8);

        System.out.println(search1);
    }
}

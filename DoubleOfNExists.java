import java.util.Arrays;

public class DoubleOfNExists {

    public static boolean binarySearch(int arr[], int n, int target){
        int lo = 0, hi= n-1;

        while(lo<=hi){
            int mid = (lo + hi)/2;

            if(arr[mid]<target){
                 lo= mid + 1;
            }else if(arr[mid]> target){
            hi = mid- 1;
            }
            else return true;
        }return false;
    }

    public static boolean checkIfExist(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int target = arr[i] * 2;
            if (binarySearch(arr, n, target)) {
                // handle the special case for zero
                if (arr[i] == 0) {
                    // need at least one more zero
                    if (i + 1 < n && arr[i + 1] == 0)
                        return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args []) {
        int arr []= {65, 74, 82, 30, 60, 100, 30};
        
    System.out.println(checkIfExist(arr));

    }
}


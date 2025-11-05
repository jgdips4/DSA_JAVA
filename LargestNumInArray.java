public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {-5,-6,-8,-1,-18};

        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }System.out.println(max);
    }
}

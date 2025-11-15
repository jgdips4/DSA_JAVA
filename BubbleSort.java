public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            boolean swap = false;
            for (int j = 0; j<arr.length-1-turn; j++ ){
                
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swap = true;
                }
            }
            if (swap==false){
                    break;
                }
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }System.err.println("");
    }


    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int miniPos = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[miniPos] > arr[j]){
                    miniPos = j;
                }
            }
            //swap
        int temp = arr[miniPos];
        arr[miniPos]= arr[i];
        arr[i]  = temp;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 7, 8};

        selectionSort(arr);
        printArray(arr);
    }
    
}

package BinarySearch;

public class findMin {
    static int findMinArr(int [] arr){
        int min = Integer.MAX_VALUE;;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
           if(arr[low] <= arr[mid]){
             min = Math.min(arr[low], min);
             high = mid - 1;
           }
           else{
            min = Math.min(arr[mid], min);
            low = mid + 1;
           }
        }
        return min;
    }
    public static void main(String[] args) {
        
    }
}

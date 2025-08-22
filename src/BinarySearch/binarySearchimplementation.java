package BinarySearch;


public class binarySearchimplementation {
    static int binaryItertive(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
       

        while(low < high){
            int mid = (low + high)/ 2;
            if(mid == target) return mid;
            else if(target > mid){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }
        return -1;
    }
    static int binaryRecursive(int[] arr, int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;

        if(mid == target){
            return mid;
        }
        if(target > mid){
           return binaryRecursive(arr, mid + 1, high, target);
        }
        else{
            return binaryRecursive(arr, low, mid - 1, target);
        }
    }
    public static void main(String[] args) {
        
    }
}

package BinarySearch;

public class floorAndCeilValue {
    static int floor(int [] arr, int target){
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = arr[mid];
            }
            else if(arr[mid] < target){
                ans = arr[mid];
                high = mid - 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    static int ceiling(int[] arr, int target){
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = arr[mid];
            }
            else if(arr[mid] < target){
               low = mid + 1;
            }
            else{
                ans = arr[mid];
                high = mid - 1;
            }
        
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
    
}

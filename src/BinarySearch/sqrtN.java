package BinarySearch;

public class sqrtN {
    static int sqrt(int []arr, int n){
        int ans = 0;
        int low = 0;
        int high = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid * mid == n)ans = mid;
            if(mid * mid > n)high = mid - 1;
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
}

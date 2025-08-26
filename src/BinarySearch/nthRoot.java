package BinarySearch;
public class nthRoot {
    static int multiply(int m, int n){
        int ans = 1;
        if(m == 0){
            return -1;
        }
        if(m == 1){
            return 1;
        }
        if(m > 1){
            for(int i = 0; i < n; i++){
                ans = ans*m;
            }
        }
        return ans;
    }
    static int nth(int[] arr, int m, int n){
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = (low + high)/2;
            int midPow = multiply(mid, n);
            if(mid ==midPow) return mid;
            if(mid > midPow) high = mid - 1;
            else{low = mid + 1;}
        }
        return -1;
    }
}

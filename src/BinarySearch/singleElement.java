package BinarySearch;
import java.util.ArrayList;
public class singleElement {
    static int single(ArrayList<Integer> arr){
        int n = arr.size();
        if(n == 1)return arr.get(0);
        if(!arr.get(0).equals(arr.get(1)))return arr.get(0);   
        if(!arr.get(n).equals(arr.get(n-1)))return arr.get(n);

        int low = 0;
        int high = n;

        while(low <= high){
            int mid = low + (high - low)/2;
            if((!arr.get(mid).equals(arr.get(mid + 1))) && (!arr.get(mid).equals(arr.get(mid - 1))))return arr.get(mid);
            if((mid %2 == 1 && arr.get(mid).equals(arr.get(mid - 1)))  || (mid % 2 == 1 && arr.get(mid).equals(arr.get(mid + 1))) ){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            

        }
    return -1;
    }
    public static void main(String[] args) {
        
    }
    
}

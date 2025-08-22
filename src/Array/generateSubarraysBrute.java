import java.util.ArrayList;
public class generateSubarraysBrute {
    
    static int countGiven(int[] arr, int target){
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++)
            {
                sum = sum + arr[j];
            }
            if(sum == target){
                count++;
            }
            
        }
        return count;
    }
   
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,3,-3,4,2,};
        int target = 3;
        int ans = countGiven(arr, target);
        System.out.println(ans);
    }
}

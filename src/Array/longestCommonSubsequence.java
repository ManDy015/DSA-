
import java.util.Arrays;
public class longestCommonSubsequence {
    // brute force approach 
    
    static int bruteForce(int[] nums){
        int longest = 1;
        int n = nums.length;
        int lastSmaller = Integer.MIN_VALUE;
        int count =0;
        
        Arrays.sort(nums);
        for(int i = 0 ; i < n; i++){
            if(nums[i] - 1 == lastSmaller){
                count += 1;
                lastSmaller = nums[i];
            }
            else if(lastSmaller != nums[i]){
                count = 0;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
   
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,10,11};
        int val = bruteForce(nums);
        System.out.println(val);
       
        
        

    }
}

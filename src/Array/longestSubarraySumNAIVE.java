// Longest subarray sum equals k;
 

public class longestSubarraySumNAIVE {
    static int longestSubarray(int[] nums, int k){
        int res = 0;
        for(int i = 0 ; i < nums.length; i++){
            int sum = 0;
             for(int j = i; j < nums.length; j++){
                 sum += nums[j];
                 if(sum == k){
                     int subLen = j - i + 1;
                     res  = Math.max(res, subLen);
                 }

             }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int k = 9;
        int res = longestSubarray(arr, k);
        System.out.println(res);
    }
}

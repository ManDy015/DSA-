 

public class longestSubarrayBETTER {
    static int longestSub(int[] nums, int k){
        int[] prefix = new int[nums.length + 1];
        prefix[0] = nums[0];
        for(int i = 0; i < nums.length; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }
    int maxLen = 0;
        for(int i = 0 ; i <  prefix.length; i++){
            for(int j = i + 1 ; j < prefix.length; j++){
                if(prefix[j] - prefix[i] == k){
                    maxLen = Math.max(maxLen, j - i );
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int k = 14;
        int res = longestSub(arr,k);
        System.out.println(res);
    }
}

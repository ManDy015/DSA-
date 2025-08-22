import java.util.HashMap;
public class longestSubarrayWithSumZero {
    static int longestBrute(int[] nums){
        int n = nums.length;
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i ; j < n; j++){
               sum += nums[j];

               if(sum == 0){
                maxLen = Math.max(maxLen, j - i + 1);
               }
            }
        }
        return maxLen;
    }

    static int longestOptimal(int [] nums){
        int maxLen = 0;
         int sum  = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
           
            sum  = sum + nums[i];
            if(sum == 0){
                maxLen = i + 1;
            }
            else{ 

                if(map.containsKey(sum)){
                    maxLen = Math.max(maxLen, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }

        return maxLen;

    }
    public static void main(String[] args) {
        int[] nums = {-2,-3,0,-5,-6,8,-2,0,4,6,8};
        System.out.println(longestBrute(nums));

        System.out.println(longestOptimal(nums));
    }
    
}

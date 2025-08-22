import java.util.HashMap;
public class countSbarraysSumK {
    static int countSubarrays(int [] nums, int k){
        HashMap < Integer, Integer> map = new HashMap<>();
        map.put(0,1); // for initial calculation for all the values from zero.
        int count = 0;
         int sum = 0;
        for(int num : nums){
            sum = sum + num;
            if(map.containsKey(sum - k)){
                count+= map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum - k, 0) +1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,8,7,6,5,4,3,0};
        int k = 7;
        int sol = countSubarrays(nums, k);
        System.out.println(sol);
    }
}

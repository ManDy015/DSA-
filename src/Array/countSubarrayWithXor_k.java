import java.util.HashMap;
public class countSubarrayWithXor_k {
    static int count(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];

            if(xor == k){
                count++;
            }

            int required = xor ^ k;
            if(map.containsKey(required)){
                count += map.get(required);
            }
            else{
                map.put(xor, map.getOrDefault(xor,0) + 1);
            }
        }

        return count;
    }
   public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;

        int result = count(arr, k);
        System.out.println("Number of subarrays with XOR = " + k + " is: " + result);
    }
}


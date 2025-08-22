import java.util.ArrayList;
import java.util.Collections;
public class leaders {
    static ArrayList<Integer> leaderInArray(int[] nums){
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        int maxFromRight = nums[n-1];
        result.add(n-1);
        for(int i = n-2; i >= 0; i++){
            if(nums[i] > maxFromRight){
                maxFromRight = nums[i];
                result.add(maxFromRight);
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
      
    }
}

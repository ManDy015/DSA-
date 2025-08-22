import java.util.HashSet;
public class longestConsecutiveOptimal{ 
 static int Optimal(int[] nums){
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0){
            return 0;
        }

        for(int num : nums){
            set.add(num);

        }

        for(int num : set){
            int count = 0;
             int currentNum = num;

             if(!set.contains(num - 1)){
                count = 1;
                currentNum = num;
             }

             while(set.contains(currentNum + 1)){
                count++;
                currentNum ++;
             }
             longest = Math.max(count, longest);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,7,9,8};
        int ans = Optimal(nums);
        System.out.println(ans);
    } 

    
}

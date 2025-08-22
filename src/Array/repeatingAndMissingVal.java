public class repeatingAndMissingVal {

    // Brute-Force Approach
    static int[] missingAndRepeating(int[]nums){
        int n = nums.length;
        int repeating = -1;
        int missing = -1;

        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    count++;
                }
                if(count == 2)repeating = i;
                else if(count == 0)missing = i;

                if(missing != -1 && repeating != -1){
                break;

            }
           
            }

        }
        return new int[] {missing, repeating};
    }

    // Better approach using hash map like array. (Not exactly a hashmap/ hasharray)
    static int[] missingAndRepeatingBetter(int[] nums){
        int[] hash =new int[ nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            hash[nums[i]]++;
        }

        int missing = -1;
        int repeating = -1;
        for(int i = 1; i < nums.length + 1; i++){
            if(hash[i] == 2)repeating = i;
            else if(hash[i] == 0)missing = i;

            if(missing != -1 && repeating != -1){
                break;
            }
        }
        return new int[]{missing, repeating};

    }

    static int[]
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,6};
        int [] solution = missingAndRepeatingBetter(nums);
        System.out.println("missing : "+solution[0]);
        System.out.println("repeating : "+solution[1]);

    }
}



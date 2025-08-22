import java.util.*;
public class _4Sum {
    static List<List<Integer>> fourSum(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = 0; i < n; i ++){

            if(i > 0 && arr[i] == arr[i - 1])continue;

            for(int j = i + 1; j < n; j++){

                if(j > i + 1 && arr[j] == arr[j - 1])continue;

                int k = j  + 1;
                int l = n - 1;

                while(k < l){

                    long sum = arr[i];
                    sum += arr[j] + arr[k] + arr[l];

                     if(sum == target){

                        List<Integer> temp = new ArrayList<>();
                        
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);

                        ans.add(temp);

                        k++;
                        l--;
                        
                        while(k < l && arr[k] == arr[k - 1])k++;
                        while(k < l && arr[l] == arr[l + 1])l--;
                     }
                     else if ( sum < target ){    // Incase if sum < target, the we need to increase the value of sum.
                        k++;
                     }
                     else{
                        l--;      // if sum > target, then we need to decrease the sum, inorder to make it equal to target;
                     }
                }
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
 

public class subArrayWithMaxSum {
    static int maxSum(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
         int sum = 0;
         for(int i = 0; i < n; i++){
             sum += arr[i];
             if(sum > max) {
                 max = sum;
             }
             if(sum < 0){
                  sum = 0;
             }
         }
         return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,-1,-4,5,6,-8,3,-3,0,-1};
        int maxSum = maxSum(arr);
        System.out.println(maxSum);
    }
}

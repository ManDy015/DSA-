

public class printSubArrayWithMaxSum {
    static int[] maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ansStart = -1; int ansEnd = -1;
        for(int i = 0; i < arr.length;i++)
        {
            sum += arr[i];

           int start = 0;

            if(sum == 0){
             start = i;
            }

            if(sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;

            }
            if(sum < 0){
                sum = 0;

            }

        }
        System.out.print("Subarray with max sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMaximum sum: " + max);

        return new int[] {start, end};

    }

    public static void main(String[] args) {


    int [] nums = {2,-2,-1,4,3,-1};



    }
}

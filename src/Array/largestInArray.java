

public class largestInArray {
    public static int largestVal(int[]arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        return largest;

    }

    public static void main(String[] args) {
        int[]arr1 = {2,6,3,8,9,0,3};
        System.out.println( largestVal(arr1));

    }
}
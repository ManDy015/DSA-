

public class secondLargest {
    public static int secondLargestVal(int[]arr){
        int largest = Integer.MIN_VALUE;
        int secondLarge = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] > largest){
                secondLarge = largest;
                largest = arr[i];

            }
           // largest = Math.max(largest,arr[i]);
        }
        return secondLarge;

    }

    public static void main(String[] args) {
        int[]arr1 = {2,6,3,7,9,0,3};
        System.out.println( secondLargestVal(arr1));

    }
}
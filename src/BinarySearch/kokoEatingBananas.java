package BinarySearch;

public class kokoEatingBananas {
    public int maxVal(int[]arr){   // To find the max value to set the limit for high in the binary search.
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }

    public int totalHours(int [] arr, int hourly ){ // to calculate the total time takebn form each mid value in the binary search.
        int totalHour = 0;
        for(int i = 0; i < arr.length; i++){
            totalHour += Math.ceil((double) (arr[i]) /( double) (hourly));
        }
        return totalHour;
    }
    public int koko(int[]arr, int h){            // BInary search program to check acc to eaach rate from 1 to the largest element in the array.
        int low = 1, high = maxVal(arr);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = totalHours(arr, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;


    }
    public static void main(String[] args) {
        
    }
}

package BinarySearch;

public class firstAndLastOcc {
    static int[] occurance(int[] arr, int number){
        int firstOcc = -1;
        int lastOcc = -1;
       
        for(int  i = 0; i < arr.length; i++){
            if(arr[i] == number){
                firstOcc = i;
                lastOcc = i;
            }
            if(arr[i] == number && firstOcc != -1){
                lastOcc = i;
            }
        }
         int[] ans = new int [] {firstOcc, lastOcc};
        return ans;

    }
    public static void main(String[] args) {
        
    }
}

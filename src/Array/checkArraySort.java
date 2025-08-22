

public class checkArraySort {
    public static boolean checkSort(int[]arr,int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;

        }
        else{
            return checkSort(arr,index+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,1,9};
        System.out.println(checkSort(arr,0));
    }
}
//Find the number that appear once while others appear twice.

 

public class maxConsecutive1 {
    static int maxConsecutive(int[] arr){
        int n = arr.length;
        int count = 0;
        int maxCount = 0;
        for(int num : arr){
            if(num == 1){
                count ++;
            }
            else{
                count = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

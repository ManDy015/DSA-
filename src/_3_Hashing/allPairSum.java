package _3_Hashing;//Find all pairs in an array with a given sum using HashMap.
import java.util.HashMap;
public class allPairSum {
    static void pairSum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            int compliment = target - num;
            if(map.containsKey(compliment)){
                int freq = map.get(compliment);
                for(int i = 0; i  < freq; i++){
                    System.out.println(compliment+" "+num+" ");
                }
            }
            map.put(num, map.getOrDefault(num,0)+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,4,5,6,7};
        int target = 5;
        pairSum(arr,target);
    }
}

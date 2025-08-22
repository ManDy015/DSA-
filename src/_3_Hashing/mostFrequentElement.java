package _3_Hashing;// Method to find most frequent element in the array.
import java.util.HashMap;
import java.util.Map;

public class mostFrequentElement {
    static int mostFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int nums : arr){
            map.put(nums,map.getOrDefault(nums,0)+1);

        }
        int maxFreq = 0;
        int mostFrequent = arr[0];
        for(int nums : map.keySet()){
            int freq = map.get(nums);
            if(freq > maxFreq){
                maxFreq = freq;
                mostFrequent = nums;

            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,2};
        int max = mostFreq(arr);
        System.out.println(max);
    }
}

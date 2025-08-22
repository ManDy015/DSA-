/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */

 

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    static int maxOcc(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()  > nums.length/2 ){
                return entry.getKey();
            }

        }
        return -1;
    }
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,3,4,5,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1};
    int res = maxOcc(arr);
    System.out.println(res);
    }
}

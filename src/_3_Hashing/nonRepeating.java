package _3_Hashing;//Given an array, find the first non-repeating element using HashMap.

import java.util.HashMap;
public class nonRepeating {
    static int nonRepeat(int[]arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0 ; i < n; i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
       for(int i  = 0; i < n; i++){
           if(map.get(arr[i]) == 1){
               return arr[i];
           }
       }
       return -1;

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int result = nonRepeat(arr);
        if(result == -1){
            System.out.println("No elements appear just once");
        }
        else{
            System.out.println("Element is :"+result);
        }
    }
}

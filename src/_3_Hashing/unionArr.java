package _3_Hashing;

import java.util.*;
public class unionArr{
    static ArrayList <Integer> union(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        ArrayList <Integer> unionA = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
        }
        for(int i = 0; i < m; i++){
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        }
        /*
        To directly store in ArrayList and sort.
        remove the above object creation of arraylist, line- 9

        ArrayList<Integer> keys = new ArrayList<>(map.keySet);
        Collections.sort(keys);

        return keys;

         */
        for(int val: freq.keySet()){
            unionA.add(val);
        }
        return unionA;
    }
    //Mostly correct, but does not print the elements in ascending order.

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = union(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }

}
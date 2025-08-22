package _3_Hashing;
import java.util.Scanner;
import java.util.HashMap;
public class find_occurance {
    public static void findOcc() {
        HashMap<Integer, Integer> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if(hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            else {
                hash.put(arr[i], 1);
            }
        }
        //fetch
        System.out.println("Elements frequencies:");
        for (int ch : hash.keySet()) {
            System.out.println(ch + ": " + hash.get(ch));
        }

    }
    }

package _3_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class using_HashMap {
    public static void usingHashMap(){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the size");

        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i < n; i++ ){
            System.out.println("Enter the elements : ");
            arr[i] = sc.nextInt();
        }

            for (int num : arr) {
                // If the number is already in the map, increment its count
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    // If it's not in the map, add it with count 1
                    map.put(num, 1);
                }
            }
        System.out.println("Enter the query");
            char c = sc.next().charAt(0);
        System.out.println(c + " appears " + map.get(c) + " times.");


    }


        public static void charFreq() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = sc.nextLine();
            sc.close();  // Always good to close the scanner

            char[] array = str.toCharArray();
            HashMap<Character, Integer> hsm = new HashMap<>();

            for (char ch : array) {
                if (hsm.containsKey(ch)) {
                    hsm.put(ch, hsm.get(ch) + 1);
                } else {
                    hsm.put(ch, 1);
                }
            }

            // Print the character frequencies
            System.out.println("Character Frequencies:");
            for (char ch : hsm.keySet()) {
                System.out.println(ch + ": " + hsm.get(ch));
            }
        }




    public static void main(String[] args) {
       // usingHashMap();
        charFreq();
    }
}

package _3_Hashing;// Check if two strings are anagrams using a HashMap.
import java.util.HashMap;
public class checkAnagrams {
    static boolean checkAnagrams1(String s1, String s2){
       if(s1.length() != s2.length()) return false;

       HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s1.toLowerCase().toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : s2.toLowerCase().toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c)-1);
            if(map.get(c) < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "banana";
        String s4 = "ananaba";

        System.out.println(checkAnagrams1(s1,s2));


    }
}

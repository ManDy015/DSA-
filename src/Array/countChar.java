//Write a Java function to count character frequencies in a string using a HashMap.
import java.util.*;
public class countChar {
    static HashMap<Character,Integer> count(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        HashMap <Character,Integer> result = count(str);
        for(Map.Entry<Character,Integer> entry : result.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

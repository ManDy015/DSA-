package _3_Hashing;
//Implement a method to group words that are anagrams of each other using HashMap.
import java.util.*;

public class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        // Create a map to store grouped anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Convert word to char array and sort it
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters); // Key

            // Put the original word into the correct group in the map
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        // Return all the grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"cat", "tac", "act", "dog", "god"};
        List<List<String>> groups = groupAnagrams(input);

        for (List<String> group : groups) {
            System.out.println(group);
        }
    }
}

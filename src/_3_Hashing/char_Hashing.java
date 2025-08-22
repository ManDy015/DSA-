package _3_Hashing;
import java.util.Scanner;
public class char_Hashing {
    public static void charHash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        char[] charArray = s.toCharArray(); //  to convert a string to array of characters.
// precompute hash.
        int [] hash = new int[256];
        for( int i = 0; i < s.length();i++){
            hash[charArray[i]]++;
        }
        System.out.println("Enter the query");
        String st = sc.next();
        char character = s.charAt(0);
        System.out.println(hash[character]+ " times it appear.");
    }

    public static void main(String[] args) {
        charHash();
    }
}

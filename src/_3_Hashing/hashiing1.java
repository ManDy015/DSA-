package _3_Hashing;
import java.util.Scanner;

public class hashiing1 {
    public static void hash(){
// To take data elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int [] elements = new int[n+1];
        System.out.println("Enter the elements in array.");
        for(int i = 0; i < n ; i++){
            elements[i] = sc.nextInt();
        }
        // to make hash table/ array
        int[] hash = new int[10];    // 10 is the ax value in the array, to create the array with max index to accomodate the values.
for(int i = 0; i < n; i++){
    hash[elements[i]] +=1;
}
// To find in hash array and display.

        System.out.println("Enter the number you want to search for :");
        int number = sc.nextInt();
        System.out.println("The "+number+ " appears "+hash[number]+" times.");



    }
public static void main(String[] args){
        hash();
}
}

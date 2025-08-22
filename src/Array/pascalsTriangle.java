import java.util.*;

public class pascalsTriangle {
    static List<Integer> genRows(int rows){
        List<Integer> ansRow = new ArrayList<>();
        long ans = 1;
        ansRow.add(1);
        for(int col = 1; col < rows; col++){
            ans = ans* (rows - col);
            ans = ans/ col;
            ansRow.add((int)ans);
        }

        
        return ansRow;
    }

    static List<List<Integer>> pascalTri(int numRow){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRow; i++){
            ans.add(genRows(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTri(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
        
    }



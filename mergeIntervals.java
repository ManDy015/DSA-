import java.util.*;
    
public class mergeIntervals {
    static int [][] mergeBrute(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int start = arr[i][0];
            int end = arr[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)){
                continue;
            }
            
            for(int j = i+1; j < n; j++){
                if(arr[j][0] <= end){
                    end = Math.max(arr[j][1], end);
                }
                else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        int[][] result = new int [ ans.size()][2];
        for(int i = 0; i < ans.size(); i++){
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        return result;
    }










    // Optimal solution

    static int[][] mergeOptimal(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            if(ans.isEmpty() || arr[i][1] < ans.get(ans.size() - 1).get(1)){
                ans.add(Arrays.asList(arr[i][0], arr[1][1]));
            }else{
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size()-1).get(1) , arr[i][1]));
            }
           

        }
            int[][] result = new int[ans.size()][2];
            for(int i = 0; i < ans.size(); i++){
                result[i][0] = ans.get(i).get(0);
                result[i][1] = ans.get(i).get(1);
            }

            return result;
            
        }
        
    
    public static void main(String[] args) {
        
    }
}


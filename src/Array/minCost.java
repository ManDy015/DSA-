public class minCost {
    static int[] [] arr =
        {
        {1,3,1},
        {1,5,1},
        {4,2,1}

    };
static int[][] dp = new int[3][3];

public static void main(String[] args) {
for(int i = 0; i < 3 ; i++)
{
    for(int j = 0 ; j < 3; j++){
        dp[i][j] = -1;
    }

   }
int minCost = solve(i:2,j:2);
    System.out.println(minCost);
}
static int solve(int i, int j)
{
    if(i ==0 && j==0)return arr[0][0];
    if(i < 0 || j < 0)return Integer.MAX_VALUE;
    if(dp[i][j] != -1)return dp[i][j];

    int up = solve(i -1, j);
    int left = solve(i, j - 1);

    return dp[i][j] = arr[i][j] + Math.min(up,left);
}

}

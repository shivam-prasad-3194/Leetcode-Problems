class Solution {
    // Time Complexity: O(m * n * (m + n))
    // Space Complexity: O(m * n * (m + n))
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length - 1; 
        int n = grid[0].length - 1;

        // memo[i][j][bracketCnt]
        // Stores the result of a state:
        // -1 → state not calculated yet
        //  0 → no valid path
        //  1 → valid path exists
        int memo[][][] = new int[m + 1][n + 1][m + n + 2];

        // Initialize all states as -1
        // -1 = state not calculated yet
        for (int[][] arr : memo) {
            for (int[] row : arr) {
                Arrays.fill(row, -1);
            }
        }

        // path must be start with '(' and end with ')'  if any one is opposite then return false
        if(grid[0][0] == ')' || grid[m][n] == '(') return false;

        // Total number of cells in a path = m + n + 1.
        // For a balanced sequence, number of characters must be even.
        if((m + n - 1) % 2 != 0) return false;

        // starting dfs(0,0) and bracketCnt is 0 
        return solve(0,0,0,grid, memo);
    }

    public boolean solve(int i, int j, int bracketCnt, char[][] grid, int[][][] memo){
        // '(' means opening bracket → +1
        // ')' means closing bracket → -1
        bracketCnt += ((grid[i][j] == '(') ? 1 : -1);

        // If count becomes negative,
        // we have more ')' than '(' → invalid path.
        if(bracketCnt < 0) return false;

        if(memo[i][j][bracketCnt] != -1){
            return memo[i][j][bracketCnt] == 1;
        }

        // if we reach at the last index and the bracket count will becomes 0 then return true otherwise false
        if(i == grid.length - 1 && j == grid[0].length - 1){
            memo[i][j][bracketCnt] = (bracketCnt == 0) ? 1 : 0; 
            return (bracketCnt == 0);
        }

        // --------------MOVE DOWN --------------
        // Move to the next row if possible. 
        if(i < grid.length - 1){
            if(solve(i + 1, j, bracketCnt, grid, memo)){
                memo[i][j][bracketCnt] = 1;
                return true;
            }
        }

        // --------------MOVE RIGHT ----------------
        // Move to the next column if possible.
        if(j < grid[0].length - 1){
            if(solve(i, j+1, bracketCnt, grid, memo)){
                memo[i][j][bracketCnt] = 1;
                return true;
            }
        }
        // Neither DOWN nor RIGHT produced a valid path.
        memo[i][j][bracketCnt] = 0;
        return false;
    }

}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1) {
            return -1;
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0 });
        int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dc = { 0, -1, 1, -1, 1, -1, 0, 1 };
        int count = 1;
        boolean vis[][] = new boolean[grid.length][grid.length];
        vis[0][0] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j <size; j++) {
                int[] current = q.remove();
                if (current[0] == grid.length - 1 && current[1] == grid.length - 1) {
                    return count;
                }
                for (int i = 0; i < dr.length; i++) {
                    int newrow = current[0] + dr[i];
                    int newcol = current[1] + dc[i];
                    if (newrow >= 0 && newrow < grid.length && newcol >= 0 && newcol < grid.length
                            && !vis[newrow][newcol] && grid[newrow][newcol] == 0) {
                        q.add(new int[] { newrow, newcol });
                        vis[newrow][newcol] = true;
                    }
                }
            }
            count++;

        }
        return -1;
    }
}
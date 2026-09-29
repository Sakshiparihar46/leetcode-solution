class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { entrance[0], entrance[1], 0 });
        int dr[] = { -1, 1, 0, 0 };
        int dc[] = { 0, 0, -1, 1 };
        maze[entrance[0]][entrance[1]] = '+';
        while (!q.isEmpty()) {
            int[] current = q.remove();
            for (int i = 0; i < dr.length; i++) {
                int newrow = current[0] + dr[i];
                int newcol = current[1] + dc[i];
                int newdist = current[2] + 1;
                if (newrow <0 || newrow >=maze.length|| newcol <0 || newcol >= maze[0].length
                        || maze[newrow][newcol] != '.' ) {
                    continue;
                }
                if (newcol == 0 || newrow == 0 || newrow == maze.length - 1 || newcol == maze[0].length - 1) {
                    return newdist;
                }
                maze[newrow][newcol]='+';
                q.add(new int[] { newrow, newcol, newdist });
            }
        }
        return -1;
    }
}
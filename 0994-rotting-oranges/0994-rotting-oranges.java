class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int[] qr={-1,1,0,0};
        int qc[]={0,0,-1,1};

        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int minutes=0;
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int []current=q.remove();
                for(int j=0;j<qr.length;j++){
                    int r=current[0]+qr[j];
                    int c=current[1]+qc[j];
                    if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
                        grid[r][c]=2;
                        fresh--;
                        q.add(new int[]{r,c});
                    }
                }
            }
            minutes++;
        }
        return fresh==0?minutes:-1;
    }
}
class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j,0});
                }
            }
        }

        if(q.isEmpty() || q.size()==grid.length*grid[0].length){
            return -1;
        }
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        int ans=0;
        while(!q.isEmpty()){
            int[] current=q.remove();
            int dist=current[2];
            for(int i=0;i<dr.length;i++){
                int r=current[0]+dr[i];
                int c=current[1]+dc[i];
                if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]==0){
                    q.add(new int[]{r,c,dist+1});
                    grid[r][c]=1;
                    ans=dist+1;
                }
            }
        }
        return ans;
    }
}
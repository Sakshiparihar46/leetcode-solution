class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q=new LinkedList<>();
        boolean vis[][]=new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    vis[i][j]=true;
                }
            }
        }

        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!q.isEmpty()){
            int []current=q.remove();
            int dist=current[2];
            for(int i=0;i<dr.length;i++){
                int newr=current[0]+dr[i];
                int newc=current[1]+dc[i];

                if(newr>=0 && newr<mat.length && newc>=0 &&  newc<mat[0].length && mat[newr][newc]!=0 && !vis[newr][newc]){
                    mat[newr][newc]=dist+1;
                    q.add(new int[]{newr,newc,dist+1});
                    vis[newr][newc]=true;
                }
            }
        }
        return mat;
    }
}
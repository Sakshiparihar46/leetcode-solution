class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int imgColor=image[sr][sc];
        if(imgColor==color){
            return image;
        }
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc]=color;

        int[]qr={-1,1,0,0};
        int[]qc={0,0,-1,1};

        while(!q.isEmpty()){
            int[] current=q.poll();
            int row=current[0];
            int col=current[1];

            for(int i=0;i<4;i++){
                int newrow=row+qr[i];
                int newcol=col+qc[i];

                if(newrow>=0 && newrow<image.length && newcol>=0 && newcol<image[0].length &&image[newrow][newcol]==imgColor){
                    image[newrow][newcol]=color;
                    q.add(new int[]{newrow,newcol});
                }
            }
        }
        return image;
    }
}
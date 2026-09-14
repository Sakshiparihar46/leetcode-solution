class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x_min1=rec1[0];
        int x_max1=rec1[2];
        int y_min1=rec1[1];
        int y_max1=rec1[3];

        int x_min2=rec2[0];
        int x_max2=rec2[2];
        int y_min2=rec2[1];
        int y_max2=rec2[3];
        if(x_max2<=x_min1){
            return false;
        }
        if(x_max1 <= x_min2){
            return false;
        }
        if(y_max2 <=y_min1){
            return false;
        }
        if(y_max1<=y_min2){
            return false;
        }
        return true;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public class info{
        int sum;
        int count;
        info(int sum,int count){
            this.sum=sum;
            this.count=count;
        }
    }
    public int ans=0;
    public info dfs(TreeNode root){
        if(root==null){
            return new info(0,0); 
        }
        info left=dfs(root.left);
        info right=dfs(root.right);

        int Sum=left.sum+right.sum+root.val;

        int Count=left.count+right.count+1; 
        int average=Sum/Count;  
        if(average==root.val){
            ans++;
        }
        return new info(Sum,Count);
        }
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }
}
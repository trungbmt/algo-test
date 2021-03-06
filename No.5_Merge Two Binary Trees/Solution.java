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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode merge;
        if(t1==null&&t2==null) return null;
        else if(t1!=null&&t2!=null) merge = new TreeNode(t1.val+t2.val);
        else if(t1==null&&t2!=null) merge = new TreeNode(t2.val);
        else merge = new TreeNode(t1.val);
        
        if(t1!=null&&t2!=null) {
            if(t1.left!=null&&t2.left!=null) {
                merge.left=mergeTrees(t1.left, t2.left);
            } else if(t1.left!=null&t2.left==null) merge.left=t1.left;
            else if(t1.left==null&t2.left!=null) merge.left=t2.left;
            if(t1.right!=null&&t2.right!=null) merge.right= mergeTrees(t1.right,t2.right);
            else if(t1.right!=null&&t2.right==null) merge.right=t1.right;
            else if(t1.right==null&&t2.right!=null) merge.right=t2.right;
        }
        return merge;
    }
}
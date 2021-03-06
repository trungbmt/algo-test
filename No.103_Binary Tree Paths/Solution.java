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
	List<String> result = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
		if(root==null) return result;
		getString(root, "");
		return result;
	}
	public void getString(TreeNode root, String current) {
		if(current.length()>0) current+= "->"+root.val;
		else current=String.valueOf(root.val);
		if(root.left==null && root.right==null) {
			result.add(current);
			return;
		}
		if(root.left!=null) getString(root.left, current);
		if(root.right!=null) getString(root.right, current);
	}
}
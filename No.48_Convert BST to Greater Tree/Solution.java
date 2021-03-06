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
	HashSet<Integer> set = new HashSet<Integer>();
	TreeNode tree;
	public TreeNode convertBST(TreeNode root) {
		this.tree = root;
		setHash(tree);
		root = changeTree(tree);
		return root;
	}
	public TreeNode changeTree(TreeNode root) {
		if(root==null) return null;
		int valroot = root.val;
		set.forEach(e -> {
			if(e>valroot) {
				root.val+=e;
			} 
		});
		
		root.left = changeTree(root.left);
		root.right = changeTree(root.right);
		return root;
	}
	public void setHash(TreeNode root) {
		if(root==null) return;
		set.add(root.val);
		setHash(root.left);
		setHash(root.right);
	}
}
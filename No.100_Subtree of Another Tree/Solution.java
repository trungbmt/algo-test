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
	public String check(TreeNode root, boolean left) {
		if (root == null) {
			if (left)
				return "leftIsnull";
			else
				return "rightIsnull";
		}
		return "#"+root.val + " " +check(root.left, true)+" " +check(root.right, false);
	}
	public boolean isSubtree(TreeNode s, TreeNode t) {
		String tree1 = check(s, true);
		String tree2 = check(t, true);
		return tree1.indexOf(tree2) >= 0;
	}
}
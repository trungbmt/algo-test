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
	public int getMinimumDifference(TreeNode root) {
		setHash(root);
		Integer[] nums = set.toArray(new Integer[set.size()]);
		Arrays.sort(nums);
		int min=Integer.MAX_VALUE;
		for(int i=0; i<nums.length-1;i++) {
			min = Math.min(min, (nums[i+1]-nums[i]));
		}
		return min;
		
	}
	public void setHash(TreeNode root) {
		if(root==null) return;
		set.add(root.val);
		setHash(root.left);
		setHash(root.right);
	}
}
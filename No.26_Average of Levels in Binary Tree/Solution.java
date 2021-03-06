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
	HashMap<Integer,Double> map = new HashMap<Integer,Double>();
	HashMap<Integer,Integer> mapcount = new HashMap<Integer,Integer>();
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<Double>();
		checkMap(root, 1);
		for(int key: map.keySet()) {
			result.add(Double.valueOf(map.get(key))/mapcount.get(key));
		}
		return result;
	}
	public void checkMap(TreeNode root , int count) {
		if(root!=null) {
			System.out.println("Key: "+count+" Value: "+root.val);
			if(map.containsKey(count)) {
				map.put(count, ((double)(map.get(count)+root.val)));
				mapcount.put(count, mapcount.get(count)+1);
			}
			else {
				map.put(count,(double) root.val);
				mapcount.put(count, 1);
			}
			checkMap(root.left, count+1);
			checkMap(root.right, count+1);
		};
	}
}
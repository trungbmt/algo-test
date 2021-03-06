class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c>nums.length*nums[0].length) {
			return nums;
		}
		Queue<Integer> queue = new LinkedList();
		int[][] result = new int[r][c];
		for(int row=0; row<nums.length; row++) {
			for(int column=0; column<nums[0].length; column++) {
				queue.add(nums[row][column]);
			}
		}
		for(int row=0; row<r; row++) {
			for(int column=0; column<c; column++) {
				result[row][column]=queue.remove();
			}
		}
        return result;
    }
}
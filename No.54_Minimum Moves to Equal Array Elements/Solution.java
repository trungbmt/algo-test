class Solution {
	int[] nums;
	int min;
	public int minMoves(int[] nums) {
		this.min = nums[0];
		this.nums=nums;
		int sum =this.getSum();
		return sum-nums.length*this.min;
	}
	public int getSum() {
		int S=0;
		for(int num: nums) {
			S+=num;
			if(num<this.min) this.min=num;
		}
		return S;
	}
}
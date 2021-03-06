class Solution {
	public int findMaxConsecutiveOnes(int[] nums) {
		if(nums.length<=1) {
			if(nums.length==1) return nums[0]==1?1:0;
			else return 0;
		}
		int count=0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length;i++) {
			if(nums[i]==1) count++;
			else {
				if(count!=0){
					set.add(count);
				}
				count=0;
			}
		}
		if(count!=0) set.add(count);
		return set.size()==0?0:Collections.max(set);
	}
}
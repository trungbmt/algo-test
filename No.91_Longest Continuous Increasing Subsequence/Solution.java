class Solution {
	public int findLengthOfLCIS(int[] nums) {
		if(nums.length==0) return 0;
		int Length= 1, maxLength=1;
		for(int i=0; i< nums.length-1 ; i ++) {
			if(nums[i+1]-nums[i]<=0) continue;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j]-nums[i] >0 ) {
					i++;
					Length++;
				}
				else {
					maxLength= Math.max(Length, maxLength);
					Length=1;
					i=j-1;
					break;
				}
			}
		}
		return Math.max(Length, maxLength);
	}
}
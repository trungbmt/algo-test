class Solution {
	public void moveZeroes(int[] nums) {
		for(int i=0;i< nums.length; i++) {
			int count =0;
			if(nums[i]==0) {
				for(int j=i+1 ; j< nums.length; j++ ) {
					nums[j-1] = nums[j];
					if(nums[j-1]!=0) count++; 
				}
				nums[nums.length-1] = 0;
				if(count>0) i--;
			}
		}
	}
}
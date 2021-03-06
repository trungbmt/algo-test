class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		if(nums.length==0) return result;
		for(int i=1; i<= nums.length; i++) {
			result.add(i);
		}
		for(int i=0; i< nums.length; i++) {
			result.set(nums[i]-1,-1 );
		}
		result.removeIf(a -> (a == -1));
		return result;
	}
}
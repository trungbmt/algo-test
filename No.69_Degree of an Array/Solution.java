public class Solution {
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	int maxcount = 0;
	int key = 0;
	public int findShortestSubArray(int[] nums) {
		for(int num: nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		maxcount= Collections.max(map.values());
		if(maxcount==1) return 1;
		int min=Integer.MAX_VALUE;
		for(int keyset: map.keySet()) {
			if(map.get(keyset)==maxcount) {
				key=keyset;
				min= Math.min(min, getShortestNum(nums));
			}
		}
		
		
		return min;
	}
	public int getShortestNum(int[] nums) {

		int firstindex = 0;
		int lastindex = 0;
		for(int i=0; i< nums.length; i ++) {
			if(nums[i]==key) {
				firstindex = i;
				break;
			}
		}
		for(int i=nums.length-1;i>0; i--) {
			if(nums[i]==key) {
				lastindex=i;
				break;
			}
		}
		return lastindex-firstindex+1;
	}
	
}
class Solution {
	public int majorityElement(int[] nums) {
		int maxVal= 0;
		int maxNum= nums[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: nums) {
			if(map.containsKey(num)) map.put(num, map.get(num)+1);
			else map.put(num, 1);
		}
		for(Integer num: map.keySet()) {
			if(map.get(num)>maxVal) {
				maxNum= num;
				maxVal = map.get(num);
			}
		}
		
		return maxNum;
	}
}
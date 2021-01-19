class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[Math.max(nums1.length, nums2.length)];
		int indexresult =0;
		
		for(int num: nums1) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int num:nums2) {
			if(map.containsKey(num)&&map.get(num)>0) {
				result[indexresult++]= num;
				map.put(num, map.get(num)-1);
			}
		}
		result = Arrays.copyOf(result, indexresult);
		return result;
	}
}
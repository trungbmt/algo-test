class Solution {
	public String[] findRelativeRanks(int[] nums) {
		String[] result = new String[nums.length];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< nums.length; i++) {
			map.put(nums[i], i);
		}
		List<Integer> mapsort = new ArrayList<Integer>(map.keySet());
		Collections.sort(mapsort, Collections.reverseOrder());

		result[map.get(mapsort.get(0))] = "Gold Medal";
		if(nums.length>1) result[map.get(mapsort.get(1))] = "Silver Medal";
		if(nums.length>2) result[map.get(mapsort.get(2))] = "Bronze Medal";
		for(int i=3;i<mapsort.size();i++) {
			result[map.get(mapsort.get(i))] = String.valueOf(i+1);
		}
		return result;
	}

}
class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> result = new HashSet<Integer>();
		for(int num:nums1) {
			set.add(num);
		}
		for(int num:nums2) {
			if(set.contains(num)) result.add(num);
		}
		
		int[] arrayresult = new int[result.size()];
		
		int i=0;
		for(Integer num:result) {
			
			arrayresult[i++] = num;
		}
		return arrayresult;
	}
}
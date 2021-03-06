class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
		for(int i=0;i<nums1.length;i++) {
			result[i] =-1;
			for(int j=getIndex(nums1[i], nums2); j<nums2.length;j++) {
				if(nums2[j]>nums1[i]) {
					result[i]=nums2[j];
					break;
				}
			}
		}
		return result;
    }
	public int getIndex(int nums, int[] nums2) {
		int index = -1;
		for(int i=0; i<nums2.length;i++) {
			if(nums==nums2[i]) return i;
		}
		return index;
	}
}
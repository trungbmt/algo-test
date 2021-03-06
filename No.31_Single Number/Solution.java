class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: nums) {
			if(map.containsKey(num)) map.remove(num);
			else map.put(num, 1);
		}
		return (int) map.keySet().toArray()[0];
    }
}
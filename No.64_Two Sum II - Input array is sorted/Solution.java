class Solution {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< numbers.length; i++) {
			map.put(numbers[i], i);
		}
		for(int i=0; i<numbers.length; i++) {
			if(map.containsKey(target-numbers[i])) return new int[] {i+1, map.get(target-numbers[i])+1};
		}
		return null;
	}
}
class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max=0;
		int freeHave=0;
		int freeNotHave=0;
		for(int curr: candies) {
			if(map.containsKey(curr)) map.put(curr, map.get(curr)+1);
			else map.put(curr, 1);
		}
		for(int curr: map.keySet()) {
			if(map.get(curr)%2==0) {
				max++;
				freeHave += map.get(curr)-2;
			} else if(map.get(curr)>2) {
				freeHave +=map.get(curr)-2;
				max++;
			} else {
				freeNotHave++;
			}
		}
		if(freeHave>=freeNotHave) max+=freeNotHave;
		else {
			max+=(freeNotHave+freeHave)/2;
		}
		return max;
    }
}
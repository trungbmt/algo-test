class Solution {
	public int countBinarySubstrings(String s) {
		int count =1;
		int result =0;
		ArrayList<Integer> group = new ArrayList<Integer>();
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			} else {
				group.add(count);
				count=1;
			}
			if(i+1==s.length()-1) group.add(count);
		}
		for(int i=0; i<group.size()-1; i++) {
			result+= Math.min(group.get(i), group.get(i+1));
		}
		return result;
	}
}
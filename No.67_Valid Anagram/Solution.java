class Solution {
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		char[] ListCharS= s.toCharArray();
		char[] ListCharT= t.toCharArray();
		Arrays.sort(ListCharS);
		Arrays.sort(ListCharT);
		if(Arrays.equals(ListCharS, ListCharT)) return true;
		else return false;
	}
}
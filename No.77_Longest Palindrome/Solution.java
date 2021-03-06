class Solution {
	public int longestPalindrome(String s) {
		int result = 0;
		
		int[] charCountList = new int[128];
		for(char c: s.toCharArray()) {
			charCountList[c]++;
		}
		
		for(int charCount: charCountList) {
			result+= 2*(charCount/2);
		}
		return s.length()>result?result+1:result;
	}
}
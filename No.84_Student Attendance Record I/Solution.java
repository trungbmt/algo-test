class Solution {
	public boolean checkRecord(String s) {
		boolean countA = false;
		if(s.charAt(0)=='A') countA=true;
		for(int i=1; i<s.length();i++) {
			if(s.charAt(i)=='A') {
				if(countA==true) return false;
				else countA=true;
			} else
			if(s.charAt(i-1)=='L' && s.charAt(i)=='L') {
				if(i<s.length()-1&&s.charAt(i+1)=='L') {
					return false;
				}
			}
		}
		return true;
	}
}
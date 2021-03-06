class Solution {
	public String reverseStr(String s, int k) {
		String result = "";
		int i=0;
		if(s.length()<k) return new StringBuilder(s.substring(i, s.length())).reverse().toString(); 
		while(i<s.length()) {
			result += new StringBuilder(s.substring(i, Math.min(i+k, s.length()))).reverse().toString();
			if(i+k<s.length()) result += s.substring(i+k, Math.min(i+2*k, s.length()));
			i+=2*k;
		}
		return result;
	}
}
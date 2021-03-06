class Solution {
	public int titleToNumber(String s) {
		int result=0;
		int index= s.length()-1;
		for(int i=0;i<s.length()-1;i++) {
			result+=(s.charAt(i)-64)*(Math.pow(26,index));
			index--;
		}
		result+=(s.charAt(s.length()-1)-64);
		return result; 
	}
}
class Solution {
	public int addDigits(int num) {
		if(num<10) return num;
		String numlist = String.valueOf(num);
		int result =0;
		for(int i=0; i < numlist.length(); i ++) {
			result+= Integer.valueOf(numlist.substring(i, i+1));
		}
		return addDigits(result);
	}
}
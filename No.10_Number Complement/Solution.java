class Solution {
    public int findComplement(int num) {
    	String nhiphan = Integer.toBinaryString(num);
		String result = "";
		for(int i=0;i<nhiphan.length();i++) {
			if(Character.getNumericValue(nhiphan.charAt(i))==1) {
				result +="0";
			} else result +="1";
		}
        return Integer.parseInt(result, 2);
    }
}
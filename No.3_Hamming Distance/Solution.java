class Solution {
    public int hammingDistance(int x, int y) {
        int cout=0;
		String a = Integer.toBinaryString(x);
		String b = Integer.toBinaryString(y);
		while(a.length()!=b.length()) {
			if(a.length()>b.length()) b= "0"+b;
			else a = "0"+a;
		}
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				cout++;
			}
		}
        return cout;
    }
}
class Solution {
	public String licenseKeyFormatting(String S, int K) {
		S = S.replaceAll("[-]","").toUpperCase();
		int offset = S.length()>K?S.length()%K:0;
		System.out.println(offset);
		for(int i=S.length()-K; i>=K; i-=K) {
			S= S.substring(0, i) + "-" + S.substring(i, S.length());
		}
		if(offset!=0) S= S.substring(0, offset) + "-" + S.substring(offset, S.length());
		return S;
	}
}
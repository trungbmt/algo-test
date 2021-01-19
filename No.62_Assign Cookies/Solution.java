class Solution {
	public int findContentChildren(int[] g, int[] s) {
		int result=0;
		Arrays.sort(g);
		Arrays.sort(s);
		int j=0;
		int i=0;
		while(i<g.length&&j<s.length) {
			if(g[i]<=s[j]) {
				result++;
				j++;
				i++;
			} else j++;
		}
		return result;
	}
}
public class Solution {
    // you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		String z =Integer.toBinaryString(n);
		int count =0;
		for(char c: z.toCharArray()) {
			if(c== 49) count++;
		}
		return count;
	}
}
class Solution {
	public boolean isOneBitCharacter(int[] bits) {
		int n = bits.length;
		if (n == 1) return true;
		if (bits[n-2] == 0) return true;
		return checkIfConsecutive1sAreEven(bits, n-2);
	}
	private boolean checkIfConsecutive1sAreEven(int[] bits, int index) {
		int bitMOT = 0;
		
		int i = index;
		while (i >= 0 && bits[i] == 1) {
			bitMOT++;
			i--;
		}
		
		return bitMOT % 2 == 0;
	}
}
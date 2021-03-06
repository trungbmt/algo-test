class Solution {
	public int[] sortArrayByParity(int[] A) {
		int result[] = new int[A.length];
		int indexStart = 0;
		int indexEnd = A.length-1;
		for(int i=0; i<A.length; i++) {
			if(A[i]%2==0) {
				result[indexStart] = A[i];
				indexStart++;
			} else {
				result[indexEnd] = A[i];
				indexEnd--;
			}
		}
		return result;
	}
}
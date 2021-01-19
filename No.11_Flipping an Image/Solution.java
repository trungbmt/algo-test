class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		int[][] result= new int[A.length][A[0].length];
		for(int row = 0; row<A.length; row++) {
			int columnresult = A[0].length-1;
			for(int column=0; column < A[0].length; column++) {
				if(A[row][column]==0) result[row][columnresult]=1;
				else result[row][columnresult]=0;
				columnresult--;
			}
		}
		return result;
	}
}
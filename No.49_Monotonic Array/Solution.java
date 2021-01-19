class Solution {
	public boolean isMonotonic(int[] A) {
		boolean Monotoic = Monotonic(A);
		for(int i=0; i< A.length-1; i++) {
			if(A[i]<A[i+1]!=Monotoic&&A[i]!=A[i+1]) {
				return false;
			}
		}
		return true;
	}
	public boolean Monotonic(int[] A) {
		for(int i=0;i<A.length-1;i++) {
			if(A[i]>A[i+1]) return false;
			else if(A[i+1]>A[i]) return true;
		}
		return true;
	}
}
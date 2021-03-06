class Solution {
	public int[] constructRectangle(int area) {
		int sqrt = (int)Math.sqrt(area);
		if(Math.sqrt(area)%1==0) {
			return new int[]{sqrt, sqrt};
		} else {
			while(sqrt>1) {
				if(area%sqrt ==0) break;
				sqrt--;
			}
			return new int[] {area/sqrt,sqrt};
		}
	}
}
class Solution {
	public int maxProfit(int prices[]) {
		if( prices.length <= 1 ) return 0;
		int min = Integer.MAX_VALUE , profit = 0; 
		for(int i = 0 ; i < prices.length - 1 ; i++) {
			if( prices[i] < min ) min = prices[i];
			profit = prices[i+1] - min > profit ? prices[i+1] - min : profit;
		}
		return profit;
	}
}
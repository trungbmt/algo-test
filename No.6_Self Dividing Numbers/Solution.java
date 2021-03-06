class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i=left;i <= right; i ++) {
			String curr;
			if((curr = String.valueOf(i)).indexOf("0")==-1) {
				boolean coutable = true;
				for(int j=0; j<curr.length();j++) {
					if(i%Character.getNumericValue(curr.charAt(j))!=0) {
						coutable = false;
						break;
					}
				}
				if(coutable==true) result.add(i);
			}
		}
		return result;
	}
}
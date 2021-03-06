class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> a = new Stack<Integer>();
		int result=0;
		for(String curr: ops) {
			try {
				int points = Integer.parseInt(curr);
				result+=points;
				a.push(points);
			}catch (Exception e) {
				if(curr.equals("+")) {
					int plus = a.peek()+ a.get(a.size()-2);
					result+=plus;
					a.push(plus);
				} else if(curr.equals("D")) {
					int plus= a.peek()*2;
					result+=plus;
					a.push(plus);
				} else if(curr.equals("C")) {
					result-=a.pop();
				}
			}
		}
		return result;
    }
}
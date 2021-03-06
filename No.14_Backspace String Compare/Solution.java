class Solution {
    public boolean backspaceCompare(String S, String T) {
		if(fixText(S).equals(fixText(T))) return true;
		else return false;
    }
	public String fixText(String S) {
		Stack<Character> stack = new Stack();
		for(char item: S.toCharArray()) {
			if(item!='#') {
				stack.push(item);
			} else if(!stack.isEmpty()) stack.pop();
		}
		return String.valueOf(stack);
	}
}
class Solution {
	public String reverseOnlyLetters(String S) {
		Stack<Character> letters = new Stack();
		for(char c: S.toCharArray()) {
			if(Character.isLetter(c)) letters.push(c);
		}
		String result= "";
		for(char c: S.toCharArray()) {
			if(Character.isLetter(c)) result+=letters.pop();
			else result+=c;
		}
		return result;
		
	}
}
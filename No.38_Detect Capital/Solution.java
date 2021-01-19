class Solution {
	public boolean detectCapitalUse(String word) {
		String upcase = word.toUpperCase();
		String tolowcase = word.toLowerCase();
		if(word.equals(upcase)||word.equals(tolowcase)) return true;
		if(word.charAt(0)==upcase.charAt(0)&&word.substring(1, word.length()).equals(tolowcase.substring(1, word.length()))) return true;
		return false;
	}
}
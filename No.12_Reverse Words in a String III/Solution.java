class Solution {
    public String reverseWords(String s) {
		String result = "";
		for(String curr: s.split(" ")) {
			result+= new StringBuilder(curr).reverse().toString()+" ";
		}
		return result.substring(0, result.length()-1); 
    }
}
class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        for(String curr: words) {
        	if(curr.toLowerCase().matches("[qwertyuiop]+") ||
        			curr.toLowerCase().matches("[asdfghjkl]+")||
        			curr.toLowerCase().matches("[zxcvbnm]+")) {
        		result.add(curr);
        	}
        }
        return result.toArray(new String[result.size()]);
    }
}
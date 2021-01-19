class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] listwords = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashMap<String, String> listTranfer = new HashMap<String, String>();
		for(int number=0; number<words.length ;number++) {
			String currresult= "";
			for(int i=0; i<words[number].length(); i++) {
				currresult+= listwords[words[number].charAt(i)-97];
			}
			listTranfer.put(currresult, "");
		}
        return listTranfer.size();
    }
}
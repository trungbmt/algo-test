class Solution {
	public String[] uncommonFromSentences(String A, String B) {
		String[] Awords = A.split(" ");
		String[] Bwords = B.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String words: Awords) {
			if(map.containsKey(words)) map.put(words, map.get(words)+1);
			else map.put(words, 1);
		}
		for(String words: Bwords) {
			if(map.containsKey(words)) map.put(words, map.get(words)+1);
			else map.put(words, 1);
		}
		ArrayList<String> result = new ArrayList<String>();
		map.forEach((k,v) -> {
			if(v==1) result.add(k);
		});
		return result.toArray(new String[result.size()]);
	}
}
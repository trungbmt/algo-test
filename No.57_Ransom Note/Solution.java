class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c: magazine.toCharArray()) {
			if(map.containsKey(c)) map.put(c, map.get(c)+1);
			else map.put(c, 1);
		}
		for(Character c: ransomNote.toCharArray()) {
			if(map.containsKey(c)) {
				if(map.get(c)>1) map.put(c, map.get(c)-1);
				else map.remove(c);
			} else return false;
		}
		return true;
	}
}
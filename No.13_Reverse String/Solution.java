class Solution {
    public void reverseString(char[] s) {
        char temp;
		int index = s.length-1;
		for(int i=0; i < s.length/2; i ++) {
			temp = s[index];
			s[index] = s[i];
			s[i]=temp;
			index--;
			
		}
    }
}
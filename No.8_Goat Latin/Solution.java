class Solution {
    public String toGoatLatin(String S) {
        String[] list = S.split(" ");
		String result="";
		for(int i=0; i<list.length; i++) {
			String newwords ="";
			char firstchar = list[i].charAt(0);
			switch (firstchar) {
			case 'a':
				newwords = list[i]+"ma";
				break;
			case 'e':
				newwords = list[i]+"ma";
				break;
			case 'i':
				newwords = list[i]+"ma";
				break;
			case 'o':
				newwords = list[i]+"ma";
				break;
			case 'u':
				newwords = list[i]+"ma";
				break;
			case 'A':
				newwords = list[i]+"ma";
				break;
			case 'E':
				newwords = list[i]+"ma";
				break;
			case 'I':
				newwords = list[i]+"ma";
				break;
			case 'O':
				newwords = list[i]+"ma";
				break;
			case 'U':
				newwords = list[i]+"ma";
				break;
			default:
				newwords = list[i].substring(1, list[i].length())+firstchar+"ma";
				break;
			}
			for(int j=1; j<=i+1;j++) {
				newwords+="a";
			}
			result+=newwords+" ";
		}
        return result.substring(0,result.length()-1);
    }
}
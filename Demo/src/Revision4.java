
public class Revision4 {
	/*4. String count of non-space chracter: Write a program to calculate the count of non-space characters in a string.

Input: This is a string
Output: 13*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="This is a string";
		int res=prog(input);
		System.out.println(res);
	}
	public static int prog(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
	}
	

}

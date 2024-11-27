
public class Revision3 {
	/*3. Revere string: Write a program to reverse a given string.
			Input: This is a string
			Output: gnirts a si sihT*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="This is a string";
		String res=prog(input);
		System.out.println(res);
	}
	public static String prog(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}

}

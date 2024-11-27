import java.util.HashMap;
import java.util.HashSet;

public class Revision2 {
	/*2. Remove duplicate char from string: Write a program to remove duplicate characters in a given String.
			Input: hackerearth
			Output: hackert*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "hackerearth";
		String res=prog(input);
		System.out.println(res);
		

	}
	public static String prog(String s) {
		String st="";
		//StringBuffer b= new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
			
			char currentChar = s.charAt(i);
			if(!st.contains(s.valueOf(currentChar)))  {
				//b.append(currentChar);
				st += currentChar; 
				
			}
		}return st;
	}
		
	

}

import java.util.ArrayList;

public class PalindromeinString{
	public static void main(String args[]) {
		
		String st="madam";
		Boolean result=Palindrome(st);
		System.out.println(result);
		
		String st1="atanudipanjanafghhgf";
		ArrayList<String> result1=palindromeArray(st1);
		System.out.println(result1);
		
		
	}
	public static Boolean Palindrome(String st) {
		String rev="";
		int len=st.length();
		char c[]=st.toCharArray();
		for(int i=len-1;i>=0;i--) {
			rev=rev+c[i];
			
			
		}
		
		if(rev.equals(st)) {
			return true;
		}else {
			return false;
		}
		
		}
	public static ArrayList<String> palindromeArray(String st){
		//atanudipanjana
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<st.length();i++) {
			for(int j=i;j<st.length();j++) {
				String temp=st.substring(i,j);
				if(Palindrome(temp)&& temp.length()>1) {
					arr.add(temp);
				}
				
			}
		}
		return arr;
	}
}

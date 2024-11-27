
public class palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam";
		prog(s1);
		

	}
	public static void prog(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
			
		}if(s.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}

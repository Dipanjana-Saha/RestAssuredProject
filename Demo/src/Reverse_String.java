import java.util.Scanner;

public class Reverse_String {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=scanner.next();
		String result=rev(a);
		System.out.println(result);

	}
/*	public static String rev(String str) {///hello
		StringBuffer sc=new StringBuffer();
		sc.append(str);
		StringBuffer str1=sc.reverse();
		
	
	    // Your code here
		return str1.toString();
	}*/
	
/*	public static String rev(String str) {
		String rev="";
		int len =str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		
		return rev;
		
	}*/
	//using character array
	public static String rev(String str) {
		String rev="";
		char c[]=str.toCharArray();//c[A,B,C,D]
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+c[i];
			
		}
		return rev;
		
	}
	


}




import java.util.ArrayList;
import java.util.Collections;

public class Q1 {
//Question 1: Write a Java Program to reverse a String.
	public static void main(String args[]) {
		String s="hello";
		
		String result=program(s);
		String result1=program1(s);
		System.out.println(result1);
		System.out.println(result);
		
		int a[]= {1,2,3,4};
		int re=largestelement(a);
		System.out.println(re);
		
		

	}
	public static String program(String st) {
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			rev=rev+st.charAt(i);
			
		}
		return rev;
	}
	public static String program1(String st1) {
		StringBuilder sb=new StringBuilder();
		sb.append(st1);
		StringBuilder str2=sb.reverse();
		return str2.toString();	
		
	}
	public static int largestelement(int[] a) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int i:a) {
			ar.add(i);
		}
		return Collections.max(ar);
		
	}

}





 
 
 
 
 
 
 
 
 
 
 
 
 

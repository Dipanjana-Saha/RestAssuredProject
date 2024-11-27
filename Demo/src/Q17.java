//Question 17: Write a Java Program to print the first non repeating character in a given String.

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		



String s="abc7cd";
HashMap<Character, Integer> r=prog(s);
		System.out.println(r);

	}public static HashMap<Character, Integer> prog(String st) {
		char[] c=st.toCharArray();//[a a b c c d]
		char count= '\u0000';
		
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			if(!hash.containsKey(c[i])) {
				hash.put(c[i], 1);
				
			}else {
				hash.replace(c[i],hash.get(c[i])+1);
			}
			
		}
		HashMap<Character,Integer> hash1=new HashMap<Character,Integer>();
		//loop by hashmap
		for(Map.Entry<Character, Integer> entry:hash.entrySet()) {
			if(entry.getValue()==1) {
				hash1.put(entry.getKey(), entry.getValue());
			}
		}return hash1;
		
		
	}

}

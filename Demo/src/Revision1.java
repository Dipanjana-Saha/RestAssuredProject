import java.util.HashMap;
import java.util.HashSet;

public class Revision1 {
	
	/* 1. Find duplicate char from string. Write a program to find duplicate characters in a given String.
	Input: hackerearth
	Output: h a e r*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st= "hackerearth";
		HashSet<Character> res=prog(st);
		System.out.println(res);

	}
	public static HashSet<Character> prog(String s) {
		char[] c=s.toCharArray();
		HashMap<Character,Integer> hash= new HashMap<Character,Integer>();
		HashSet<Character> hash1=new HashSet<Character>();
		for(char ct:c) {
			if(hash.containsKey(ct)) {
				hash.put(ct, hash.get(ct)+1);
				hash1.add(ct);
				
			}else {
				hash.put(ct,1);
			}
		}
		return hash1;
	}

}

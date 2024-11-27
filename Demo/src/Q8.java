import java.util.HashMap;
import java.util.HashSet;

public class Q8 {
//Question 8: Write a Java Program to find the duplicates of a given String.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dipanjana";
		HashSet<Character> r=duplicate(s);
		System.out.println(r);
		

	}
	public static HashSet<Character> duplicate(String a){
		
		char c[]=a.toCharArray();
		HashSet<Character> duplicates = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		HashMap<Character,Integer> hash= new HashMap<Character,Integer>();
		for(char ch:c) {
			if(hash.containsKey(ch)) {
				  hash.put(ch, hash.get(ch) + 1); // Increment the count
	                duplicates.add(ch); //gives the duplicate character
	                
			}else {
				 hash.put(ch, 1);
				// duplicates.add(ch);//gives the non duplicate characters
			}
		}return duplicates;
	}
	

}

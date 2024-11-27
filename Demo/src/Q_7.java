import java.util.HashMap;
//Question 7:  Write a Java Program to count the number of characters in a given String.
public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dipanjana";
		HashMap<Character,Integer> r=count_of_each_character(s);
		System.out.println(r);

	}
	public static HashMap<Character,Integer> count_of_each_character(String a) {
		
		HashMap<Character,Integer> hash= new HashMap<Character,Integer>();
		char c[]=a.toCharArray();
		for(char ch:c) {
			if(hash.containsKey(ch)) {
				hash.put(ch, hash.get(ch)+1);
				
			}
			else {
				hash.put(ch, 1);
			}
			
		}return hash;
		
	}

}

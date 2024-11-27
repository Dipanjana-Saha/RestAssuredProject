import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q23 {
	/*Question 23: Write a Java Program to iterate through the HashMap.
	Solution 23: There are multiple ways to iterate through the HashMap. 
	We can either use the keySet() or entrySet() and 
	then using the iterator we can iterate through the given HashMap.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hash_map = new HashMap<>();

		hash_map.put("India", "New Delhi");
		hash_map.put("France", "Paris");
		hash_map.put("Germany", "Berlin");
		hash_map.put("Australia", "Canberra");
		String s=prod(hash_map);
		System.out.println(s);

	}
	
	public static String prod(HashMap<String, String> hash_map) {
		StringBuilder result = new StringBuilder();
		
		//how to iterate by entrySet in hashmap
		for(Entry<String, String> entry:hash_map.entrySet()) {
			
			 result.append("Country: ").append(entry.getKey())
             .append(", Capital: ").append(entry.getValue()).append("\n");
   }
   return result.toString();
		
	}

}

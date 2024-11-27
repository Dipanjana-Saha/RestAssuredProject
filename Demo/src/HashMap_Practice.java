import java.util.HashMap;

public class HashMap_Practice {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hash= new HashMap<>();
		hash.put("Maths", 25);
		hash.put("Physics", 15);
		hash.put("history", 90);
		hash.put("Bengali", 56);
		hash.put("Bio", 85);
		
		hash.remove("Bengali");
		hash.replace("Maths", 10);
		hash.putIfAbsent("Maths", 100);
		hash.putIfAbsent("sociology", 23);
		System.out.println(hash.getOrDefault("geo", 5));
		System.out.println(hash.containsKey("geo"));
		
		hash.forEach((subject,score) ->{
			hash.replace(subject, score-10);
		});
		
		System.out.println(hash.toString());

	}

}

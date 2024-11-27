import java.util.Arrays;
import java.util.HashMap;

public class gameOfThone {

	public static void main(String[] args) {
		
		String s="cdcdcdcdeeeef";
		String result=gameOfThrones(s);
		System.out.println(result);
		
		
	}

	
    public static String gameOfThrones(String s) {
      /*  char c[]=s.toCharArray();//aaabbb
        Arrays.sort(c);
        int len=c.length;
        for(int ch=0;ch<len;ch++) {
        	if(c[ch])
        }
        String rev="";
        
        for(int ch=len-1;ch>=0;ch--){
          rev+=c[ch];
        }
        if(rev.equals(c)){
          return "YES";
        }else{
          return "NO";
        }*/
    	char c[]=s.toCharArray();
    	HashMap<Character,Integer> hash= new HashMap<>();
		//ArrayList<Integer> duplicatearray= new ArrayList<>();
		for(char number:c) {
			if(hash.containsKey(number)) {
				//duplicatearray.add(number);
				hash.replace(number, hash.get(number)+1);
			}else{
			hash.put(number, 1);
		}
		
		}
		if((number >1) {
			return "NO";
		}else {
			return "YES";
		}

		
}}
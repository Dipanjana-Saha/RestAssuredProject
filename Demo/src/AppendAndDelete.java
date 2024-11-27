
public class AppendAndDelete {
	
	public static void main(String args[]) {
		
		String s="y";
		String t="yu";
		int k=2;
		String st=appendordelete(s,t,k);
		System.out.println(st);
	}
	public static String appendordelete(String s,String t,int k) {
		int i=0;
		while(i<s.length()&& i<t.length()) {
			if(s.charAt(i)!=t.charAt(i)) {
				break;
			}
			i++;
		}
		int total=(s.length()-i)+ (t.length()-i);
		if(total<=k) {
			return "YES";
		}
		return "NO";
	}

}

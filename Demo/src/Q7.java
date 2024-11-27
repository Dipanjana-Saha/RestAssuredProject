
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		int result=count(s);
		System.out.println(result);

	}
	public static int count(String st) {
		
		char c[]=st.toCharArray();
		int l=c.length;
		return l;
	}

}


public class Revision6 {
	/*input: hello world this is me
	 *output :me is this world hello*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello world this is me";
		String res=prog(input);
		System.out.println(res);

	}
	public static String prog(String s) {
		String[] a=s.split(" ");//split at string space
		String rev="";
		
		for(int i=a.length-1;i>=0;i--) {
			rev+=a[i] + " ";
		}
		return rev;
	}

}

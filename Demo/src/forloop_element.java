
public class forloop_element {

	public static void main(String[] args) {
		
		int numbers[]= {1,2,3,4,5};
		for(int num:numbers) {
			System.out.println(num);
		}
		String str= "abcdef";
		for(int i=0;i<str.length();i++) {
			char items=str.charAt(i);
			System.out.println(items);
			
		}
		char c[]= {'g','h','i','j','k'};
		for(char ch:c) {
			System.out.println(ch);
		}
		// TODO Auto-generated method stub

	}

}

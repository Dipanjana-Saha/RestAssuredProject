
public class Q6 {
//Question 6: Write a Java Program to check if a number is Prime or not.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		String result=program(a);
		System.out.println(result);
		

	}
	public static String program(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return " non prime";
			}
				
		}return "prime";
		
	}

}

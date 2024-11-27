import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the palindrome");
		int a= scanner.nextInt();
		int result=palindrome(a);
		if(result==a) {
			System.out.println("Palimdrome");
		}else {
			System.out.println("not a palindrome");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the palindrome string");
		String b=scanner.next();
		String resultstr=palindrome_str(b);
		if(resultstr==b) {
			System.out.println("Palimdrome str");
		}else {
			System.out.println("not a palindrome str");
		}
	}

	
	public static int palindrome(int num) {
		int rev=0;
		int numCopy=num;
		while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		
		}return rev;
		}
	
	public static String palindrome_str(String str) {
		String rev1="";
		int len=str.length();
		char c[]=str.toCharArray();
		for(int i=len-1;i>=0;i--) {
			rev1=rev1+c[i];
		}
	return rev1;

}}

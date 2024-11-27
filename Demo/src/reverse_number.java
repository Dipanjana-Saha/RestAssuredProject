import java.util.Scanner;

public class reverse_number {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type the number");
		int num=sc.nextInt();
		
	/*	int rev=0;
		while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		
		}
		System.out.println(rev);*/
		
	/*	StringBuffer sb=new StringBuffer();
		sb.append(num);
		StringBuffer rev1=sb.reverse();
		System.out.println(rev1);*/
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev1=sb.reverse();
		System.out.println(rev1);
		
/*		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println(rev);*/
		
		
		
	}
		
		

}

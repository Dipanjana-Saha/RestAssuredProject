import java.util.Scanner;

public class uptiontree{
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of cycle");
		int a=scanner.nextInt();
		int result=height(a);
		System.out.println(result);
		
		
		
		
	}
	public static int height(int n) {
		int intialheight=1;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				intialheight=intialheight*2;
			}else {
				intialheight=intialheight+1;
			}
			
		}
		return intialheight;
	}
}

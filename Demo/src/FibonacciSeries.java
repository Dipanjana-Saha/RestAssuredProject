import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		List<Integer> result=fibonacci(a);
		System.out.println(result);

	}
	public static List<Integer> fibonacci(int num){
		int a=0;
		int b=1;
		List<Integer> list= new ArrayList<>();
		list.add(a);
		list.add(b);
		
		for(int i=2;i<num;i++) {
			int c=a+b;
			list.add(c);
			a=b;
			b=c;
		}
		return list;
		
	}

}

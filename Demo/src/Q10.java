import java.util.ArrayList;
//Question 10: Write a Java Program to reverse an array?
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		ArrayList<Character> r=prog(s);
		System.out.println(r);
		

	}
	public static ArrayList<Character> prog(char[] arr) {
		
		 int a=arr.length;//5
		 ArrayList<Character> rev = new ArrayList<Character>();
		
		for(int i=a-1;i>=0;i--) {//e//4
			rev.add(arr[i]);//5-4-1=0,5-3-1=1
		}return rev;
	}

}

//Question 21: Write a Java Program to shift all zeros on the right.
import java.util.ArrayList;
public class Q21 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub



int[] inputArray = { 1, 0, 2, 0, 3, 0, 0, 0 };
ArrayList<Integer> r=prog(inputArray);
System.out.println(r);
	}
	
	public static ArrayList<Integer> prog(int[] a) {
		ArrayList<Integer> n=new ArrayList<Integer>();
		ArrayList<Integer> n1=new ArrayList<Integer>();
		for(int num:a) {
			if(num==0) {
				n.add(num);
			}
			else {
				n1.add(num);
			}
		}
		for(int z:n) {
			n1.add(z);
		}
		return n1;
		
	}

}

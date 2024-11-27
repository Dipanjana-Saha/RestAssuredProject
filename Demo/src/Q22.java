//Question 22: Write a Java Program to remove the duplicates from an array.
import java.util.ArrayList;
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



int[] array = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
ArrayList<Integer> r=prog(array);

System.out.println(r);

	}
	public static ArrayList<Integer> prog(int[] a) {
		
		ArrayList<Integer> arr=new ArrayList<Integer> ();
		for(int num:a) {
			if(!arr.contains(num)) {
				arr.add(num);
			}
		}
		return arr;
		
	}

}

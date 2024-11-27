import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		
		int numbers[]= {1,2,3,4,5};
		int copyOfNumbers[]=Arrays.copyOf(numbers,numbers.length);
		int copyOfNumbers1[]=Arrays.copyOf(numbers,10);
		
		Arrays.fill(numbers,0);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(copyOfNumbers));
		System.out.println(Arrays.toString(copyOfNumbers1));

	}

}

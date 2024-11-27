import java.util.Arrays;

public class arrayFill {

	public static void main(String[] args) {
		
		char vowel[]={'i','o','u','a','e'};
		int startindex=1;
		int endindex=4;
		Arrays.fill(vowel,startindex,endindex,'x');
		System.out.println(Arrays.toString(vowel));

	}

}

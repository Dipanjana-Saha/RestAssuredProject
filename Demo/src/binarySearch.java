import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		
		char vowel[]={'i','o','u','a','e'};
		vowel[2]='n';
		int startindex=1;
		int endindex=4;
		Arrays.sort(vowel);
		char search='n';
		int index=Arrays.binarySearch(vowel,startindex,endindex,search);
		System.out.println(Arrays.toString(vowel));
		System.out.println(index);
		
		

	}

}

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
	//	char vowel[]= new char[5];
	//	char vowel[]={'a','e','i','o','u'};
		char vowel[]={'e','u','a','o','i'};
		Arrays.sort(vowel);
		char key= 'o';
		int foundItemIndex=Arrays.binarySearch(vowels,key,startingIndex,startingIndex);
		
	/*	vowel[0]='a';
		vowel[1]='e';
		vowel[2]='i';
		vowel[3]='o';
		vowel[4]='u';*/
		int startingIndex=1;
		int endingIndex=4;
		
		Arrays.sort(vowel,startingIndex,endingIndex);
		
		System.out.println(Arrays.toString(vowel));
		System.out.println(foundItemIndex);
		//System.out.println(vowel);


	}

}

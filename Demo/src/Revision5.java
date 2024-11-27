
public class Revision5 {
	/*5. Swap two string using Substring: Write a program to swap the two strings using substring.

Input: Hello world
Output: World Hello*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello world";
		int space=input.indexOf(' ');
		
		String firstPart=input.substring(0,space);
		String lastPart=input.substring(space+1);
		
		// Concatenate substrings in reverse order
        String result = lastPart + " " + firstPart;
        
        // Output the result
        System.out.println(result);

	}

}

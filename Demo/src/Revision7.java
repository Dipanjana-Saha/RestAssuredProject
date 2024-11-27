
public class Revision7 {
	/*8. Swap two number: Write a program to swap the two numbers using the substring method.

Input: 10 20
Output: 20 10*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 10;
		int secondNumber = 20;

		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println(firstNumber);
		System.out.println(secondNumber);

	}

}

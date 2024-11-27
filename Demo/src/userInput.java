import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name");
		String name=scanner.nextLine();
		System.out.println("What is your age");
		int age=scanner.nextInt();
		//int age=Integer.parseInt(scanner.nextLine());
		System.out.println("Myname is"+ name);
		System.out.println("Myage is"+ age);
		// TODO Auto-generated method stub;

	}

}

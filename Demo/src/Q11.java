
public class Q11 {
	//Question 11: Write a Java Program to get the count of Capitalized words in a String.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="RahulShetty Academy";
		int r=prog(s);
		System.out.println(r);

	}
	public static int prog(String st) {
		
		int count=0;
		char c1[]=st.toCharArray();
		for(char c:c1) {
			if(Character.isUpperCase(c)) {//find the upper case 
				count+=1;
			}
			
		}return count;
		
	}

}

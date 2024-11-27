package oops;
//input-a2b3c4 output-aabbccc
public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="a2b3c4";
		String r=program(a);
		System.out.println(r);

	}
	public static String program(String s) {
		
		StringBuilder output= new StringBuilder();
		
		for (int i=0;i<s.length();i+=2) {
			char character=s.charAt(i);//a
			int num=Character.getNumericValue(s.charAt(i+1));
			for(int j=0;i<num;j++) {
				output.append(character);
				
			}
			
		}
		return output.toString();
	}

}

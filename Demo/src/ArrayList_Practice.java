import java.util.ArrayList;

public class ArrayList_Practice {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(5);
		arr.add(12);
		arr.add(20);
		arr.add(6);
		arr.add(9);
		
		arr.forEach(num ->{
			arr.set(arr.indexOf(num), num * num);//
		});
		System.out.println("after manupulation of array"+arr);
		System.out.println("after manupulation of array"+arr.toString());
	}

}

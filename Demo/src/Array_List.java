import java.util.ArrayList;
import java.util.Comparator;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		//numbers.get(1);
		//numbers.clear();//clear all array
		//numbers.set(2,Integer.valueOf(7));//replace 3 by 7
		numbers.sort(Comparator.naturalOrder());
		//numbers.sort(Comparator.reverseOrder());
		//numbers.size();
		//numbers.contains(Integer.valueOf(1));//checks true or false that the no is there or not
		//numbers.isEmpty();false
		numbers.remove(Integer.valueOf(6));
		System.out.println(numbers.toString());
	/*	numbers.forEach(number -> {
			int a =number*2;
			int b = number * 3;
			System.out.println(a+b);//lamda function
		});*/
		numbers.forEach(number ->{
			int a =number*2;
			int b = number * 3;
			numbers.set(numbers.indexOf(number), a+b);
		
		});
		System.out.println(numbers.toString());
	}

}

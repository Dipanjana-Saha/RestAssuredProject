import java.util.ArrayList;
import java.util.HashMap;

public class findDuplicate_Program {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(12);
		arr.add(15);
		arr.add(13);
		arr.add(1);
		
	//	ArrayList<Integer> duplicatenumber=Duplication(arr);
		HashMap<Integer,Integer> hash1=Duplication(arr);
		System.out.println(hash1);

	}
	public static HashMap<Integer,Integer> Duplication(ArrayList<Integer> num){
		
		//HashMap<Integer,Boolean> hash= new HashMap<>();
		HashMap<Integer,Integer> hash= new HashMap<>();
		//ArrayList<Integer> duplicatearray= new ArrayList<>();
		for(Integer number:num) {
			if(hash.containsKey(number)) {
				//duplicatearray.add(number);
				hash.replace(number, hash.get(number)+1);
			}else{
			hash.put(number, 1);
		}
		}
		return hash;
	}

}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JumpingClouds {

	public static void main(String[] args) {
		
		List<Integer> list= Stream.of(0,1,0,0,0,1,0).collect(Collectors.toList());
		System.out.println(list);
	//	List<Integer> list1=Arrays.asList(0,1,0,0,0,1,0); another way of converting list to array
		int totalJump=jumpingcloud(list);
		System.out.println(totalJump);
		


	}
	public static int jumpingcloud(List<Integer> a) {
		int current=0;
		int jump=0;
		while(current<a.size()-1) {
			if(a.get(current+2)==0) {
				jump=jump+1;
				current+=2;
			}else {
				jump+=1;
				current+=1;
			}
		}
		return jump;
		
	}

}

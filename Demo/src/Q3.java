import java.util.ArrayList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		ArrayList<Integer> list= new ArrayList<>(4);
		list.add(a);
		list.add(b);
		for(int i=2;i<4;i++) {
			int c=a+b;
			list.add(c);
			a=b;
			b=c;
		}System.out.println(list);

	}

}


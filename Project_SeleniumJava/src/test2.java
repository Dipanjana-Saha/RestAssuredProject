import java.util.ArrayList;

import java.util.stream.Stream;

	import org.testng.annotations.Test;

	public class test2 {

		
			//count the number of names starting with A
		/*	@Test
			public void regular()
			{
				ArrayList<String> names= new ArrayList<String>();
				names.add("Dipa");
				names.add("Atanu");
				names.add("Tripti");
				names.add("Ram");
				names.add("Arohi");
				names.add("Ahon");
				int count=0;
				for(int i=0;i<names.size();i++) {
					String actual=names.get(i);
					if(actual.startsWith("A")) {
						count++;
						
					}
				}
				System.out.println(count);
			}*/
			@Test
			public void streamFilter() {
				ArrayList<String> names= new ArrayList<String>();
				names.add("Dipa");
				names.add("Atanu");
				names.add("Tripti");
				names.add("Ram");
				names.add("Arohi");
				names.add("Ahon");
				
				long c=names.stream().filter(s->s.startsWith("A")).count();
				System.out.println(c);
				
			}

}

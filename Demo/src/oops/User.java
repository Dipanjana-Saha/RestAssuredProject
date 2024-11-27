package oops;
import java.time.LocalDate;
import java.time.Period;

public class User {
	//these are the usr propeerties
	public String name;
	public LocalDate DOB;
	public int age;
	public String address;
	
	public  int age() {
		int age=Period.between(this.DOB,LocalDate.now()).getYears();
		return age;
	}
	
	

}

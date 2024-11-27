package oops;

import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		User us= new User();
		us.name="Dipanjana";
		us.DOB=LocalDate.parse("1998-06-18");
		us.address="Kaikhali";
	//	us.age=26;
		us.age=us.age();
		System.out.printf(" my name is %s.i born in %s I live in %s My age is %d",us.name,us.DOB.toString(),us.address,us.age);

	}

}

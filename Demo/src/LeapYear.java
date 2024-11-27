
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2020;
		if(prog(year)) {
			System.out.println("Leap");
		}else {
			System.out.println("not leap");
		}

	}
	public static boolean prog(int yr) {
		if((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
			return true;
		}else {
			return false;
		}
		
	}

}

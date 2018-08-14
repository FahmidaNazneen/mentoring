package homework3;

public class TestCar {

	public static void main(String[] args) {
	Car car1 = new Car ();
	Car car2 = new Car ("toyata", "black");
	Car car3 = new Car ("Gayco", 2018, "gray");
	Car car4 = new Car (2015, "BMW");
			
	car1.displaycarColor();
	
	car2.displaycarIsurance();
	
	car3.displaycarModel();
	
	car4.displaycarName();
	

	}

}

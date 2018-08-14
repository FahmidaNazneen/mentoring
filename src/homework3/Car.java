package homework3;

public class Car {
	
	// variables 
	
	String carName = "Toyota";
	String carColor = "black";
	String carInsurence = "prograssive";
	int carModel =2018;
	
	// Methods
	
	public void  displaycarName() {
		System.out.println(carName);
		
	}
	public void displaycarColor() {
	
		System.out.println(carColor);
		
	}
	public void displaycarModel() {
		System.out.println(carModel);
		
	} 
	public void displaycarIsurance() {
		System.out.println(carInsurence);
	}
	
	//Constructor-1
	
	public Car() {
		
	}
	//Constructor-2
	
	public Car(String carName, String carColor) {
		this.carName = carName;
	    this.carColor = carColor;
	    System.out.println(carName + " "+ carColor);
	    		
		
	}
	//Constructor-3
	
	public Car (String carInsurence , int carModel, String carColor) {
		this.carInsurence = carInsurence ;
		this.carModel = carModel; 
		this.carColor = carColor;
		System.out.println(carInsurence + " " + carModel +" "+ carColor);
		
		
	}
	//Constructor-4
	
	public Car (int carModel, String carName) {
		this. carModel =  carModel;
	    this.carName = carName;
	    System.out.println(carModel + " "+ carName);
	    		
		
	}
	
	
	
	
			


















}
     

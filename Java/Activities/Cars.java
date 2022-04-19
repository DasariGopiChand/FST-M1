
public class Cars {
	
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	
	Cars() {
		
		tyres = 4;
		doors = 4;
		
	}
	
	void displayCharacteristics(){
		
		System.out.println("the color of the car "+ color);
		System.out.println("the transmission of the car "+ transmission);
		System.out.println("the make of the car "+ make);
		System.out.println("the number of tyres car have "+ tyres);
		System.out.println("the number of doors car have "+doors);
	}
	void accelarate(){
		System.out.println("Car is now accelarating");
	}
	void brake(){
		System.out.println("car is now stopped");
	}

}

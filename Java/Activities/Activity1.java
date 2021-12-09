package activities;


class Car {

	String color;
	String Transmission;
	int make;
	int tyres;
	int doors;

	public Car() {

		tyres = 4;
		doors = 4;
	}

	public void displayCharacteristics() {

		System.out.println("Car Colore : " + color);
		System.out.println("Transmission : " + Transmission);
		System.out.println("Make : " + make);
		System.out.println("Number of Tyres : " + tyres);
		System.out.println("Number of Doors : " + doors);
		System.out.println("-------------------------");

	}

	public void accelarate() {
		System.out.println("Car is moving forward.");
	}

	public void brake() {
		System.out.println("Car has stopped.");
	}

}

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car Toyota= new Car();
		
		Toyota.Transmission="manual";
		Toyota.make=2010;
		Toyota.color="Red";
		Toyota.doors= 5;
		Toyota.displayCharacteristics();
		Toyota.accelarate();
		Toyota.brake();

	}

}

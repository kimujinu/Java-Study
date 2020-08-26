package abstract_example;

public class CarSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar Car1 = new ElectricCar("red","Woojin");
		gasolineCar Car2 = new gasolineCar("Yellow","JINwoo");
		Car1.setColor("Black");
		Car1.printInfo();
		Car2.printInfo();
		Car2.setColor("blue");
		
	}

}

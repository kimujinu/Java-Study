package abstract_example;

public class ElectricCar extends Car_for_abstract {

	public ElectricCar(String color, String manufacturer) {
		super(color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fillup() {
		// TODO Auto-generated method stub
		return "���⸧�� �����մϴ�.";
	}
	
	public void setColor(String color) {
		this.color = color;
	}

}

package abstract_example;

public class gasolineCar extends Car_for_abstract {

	public gasolineCar(String color, String manufacturer) {
		super(color, manufacturer);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String fillup() {
		// TODO Auto-generated method stub
		return "���⸧���� ����";
	}
	
	public void setColor(String color) {
		this.color = color;
	}

}

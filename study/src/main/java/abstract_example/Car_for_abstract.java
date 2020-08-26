package abstract_example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car_for_abstract {
	protected String color;
	protected String manufacturer;
	
	public void printInfo() {
		System.out.println("이차의 색은"+ this.color);
		System.out.println("이차는"+this.fillup());
		System.out.println("이차의 제조업체는"+this.manufacturer);
	}

	public abstract String fillup();
}

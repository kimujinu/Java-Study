package abstract_example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car_for_abstract {
	protected String color;
	protected String manufacturer;
	
	public void printInfo() {
		System.out.println("������ ����"+ this.color);
		System.out.println("������"+this.fillup());
		System.out.println("������ ������ü��"+this.manufacturer);
	}

	public abstract String fillup();
}

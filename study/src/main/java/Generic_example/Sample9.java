package Generic_example;

public class Sample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer1 mem = new Computer1(new Memory());
		
	}

}

class Computer1{
	
	private String componentClassName;
	
	public void toInfo() {
		System.out.println(componentClassName);
	}
	
	public <T extends ComputerPart>Computer1(T component) {
		this.componentClassName = component.getClass().getName();
	}
	
}
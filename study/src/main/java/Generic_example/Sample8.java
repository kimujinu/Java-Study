package Generic_example;

public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Computer<ComputerPart> vga = new Computer<ComputerPart>();
			vga.setComponent(new Grapgics());
			vga.toInfo();
			
			Computer<ComputerPart> mem = new Computer<>(new Memory());
			mem.toInfo();
			
	}

}


//��ǻ�� ���� ��ǰ ��� ��ü
class ComputerPart {
	
}

//�׷��� ī�� 
class Grapgics extends ComputerPart{
	
}

//�޸�
class Memory extends ComputerPart{
	
}

//�����
class Monitor{
	Computer<Memory> me = new Computer<>();
}

class Computer<T extends ComputerPart>{
	private T component;
	
	public void toInfo() {
		System.out.println(component.getClass().getName());
	}
	public Computer(T component) {
		super();
		this.component = component;
	}
	public void setComponent(T component) {
		this.component = component;
	}
	public Computer() {
		
	}
}

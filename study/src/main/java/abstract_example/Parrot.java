package abstract_example;

public class Parrot extends Pet {

	public Parrot(boolean wing, int legcount) {
		super(wing, legcount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.printf("%s�� �ι߷� �ݴϴ�\n.",name);
	}
	
	public void fly(String name) {
		System.out.printf("%s�� �����ʰ� ������ϴ�.\n", name);
	}

}

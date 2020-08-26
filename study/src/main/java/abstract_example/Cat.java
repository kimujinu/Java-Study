package abstract_example;

public class Cat extends Pet{

	public Cat(boolean wing, int legcount) {
		super(wing, legcount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.printf("%s는 소리없이 조용하게 뜁니다.\n",name);
	}

}

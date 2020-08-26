package abstract_example;

public class Parrot extends Pet {

	public Parrot(boolean wing, int legcount) {
		super(wing, legcount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.printf("%s´Â µÎ¹ß·Î ¶Ý´Ï´Ù\n.",name);
	}
	
	public void fly(String name) {
		System.out.printf("%s´Â ¶ÙÁö¾Ê°í ³¯¶ó´ó±é´Ï´Ù.\n", name);
	}

}

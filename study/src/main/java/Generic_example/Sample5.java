package Generic_example;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample4 age = new Sample4();
		Sample4 name = new Sample4();
		
		age.setA(26);
		name.setA("자누");
		
		int personAge = (int)age.getA();
		String personName = (String)name.getA();
		
		System.out.printf("%s은 %d살 이다.", personName, personAge);
		
	}

}

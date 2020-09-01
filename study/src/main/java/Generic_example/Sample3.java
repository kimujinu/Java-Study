package Generic_example;

public class Sample3 {

	public static void main(String[] args) {
		Sample age = new Sample();
		Sample2 name = new Sample2();
		
		age.setA(26);
		name.setA("자누");
		
		int personAge = age.getA();
		String personName = name.getA();
		
		System.out.printf("%s은 %d살 이다.", personName, personAge);
		

	}

}

package Generic_example;

public class Sample3 {

	public static void main(String[] args) {
		Sample age = new Sample();
		Sample2 name = new Sample2();
		
		age.setA(26);
		name.setA("�ڴ�");
		
		int personAge = age.getA();
		String personName = name.getA();
		
		System.out.printf("%s�� %d�� �̴�.", personName, personAge);
		

	}

}

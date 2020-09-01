package Generic_example;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample6<Integer> age = new Sample6<>();
		Sample6<String> name = new Sample6<>();
		
		age.setT(26);
		name.setT("자누");
		
		int personAge = age.getT();
		String personName = name.getT();
		
		System.out.printf("%s은 %d살 이다.", personName, personAge);
	}

}

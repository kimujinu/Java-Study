package Generic_example;

public class Sample13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberBox box = new NumberBox();
		box.setNumber(2020);
		
	}

}

class NumberBox {
	public <Z extends Number> void setNumber(Z z) {
		System.out.printf("입력된 값은 %s 입니다.",z.toString());
	}
}

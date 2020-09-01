package Generic_example;

public class Sample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.setValue(3);
		data.setValue("3");
		System.out.println(data.getValue());
	}

}

class Data {
	String value;
	
	public <T> void setValue(T t) {
		this.value = t.toString();
	}

	public String getValue() {
		return value;
	}
	
	
}

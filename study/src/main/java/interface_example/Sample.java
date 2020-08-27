package interface_example;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICompute a = new Apartment();
		float area = a.compute(30);
		System.out.println(area);
		
	}
}

class Apartment implements ICompute{
	
	@Override
	public float compute(int area) {
		// TODO Auto-generated method stub
		return area * temp;
	}	
}

interface ICompute {
	float temp = 3.3f; // static final float temp = 3.3f;
	float compute(int area);
	default float size(int area) {
		return area/ temp;
	}
}

package Generic_example;

public class Sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<Integer, Integer> Jinwoo = new Student<>(1,4); 
		Jinwoo.printInfo("����");
	}

}


class Student<G, C>{
	G g;
	C c;
	
	public void printInfo(String name) {
		System.out.printf("%s�� %d�г� %d��\n",name,g,c);
	}

	public Student(G g, C c) {
		this.g = g;
		this.c = c;
	}
	
	
}

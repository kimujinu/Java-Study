package interface_example;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student p1 = new Person1();
		p1.study();
		Teacher p2 = new Person2();
		p2.teach();
		Person3 p3 = new Person3();
		p3.study();
		p3.teach();
		
	}

}


interface Student {
	void study();
}

interface Teacher {
	void teach();
}

class Person1 implements Student{
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("인간1이 공부한다.");
	}
}

class Person2 implements Teacher{@Override
	public void teach() {
	// TODO Auto-generated method stub
		System.out.println("인간2가 가르친다");
	}
}

class Person3 implements Student, Teacher{
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("인간3이 공부한다.");
	}@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("인간3가 가르친다");
	}
}
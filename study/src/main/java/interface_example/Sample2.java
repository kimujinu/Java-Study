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
		System.out.println("�ΰ�1�� �����Ѵ�.");
	}
}

class Person2 implements Teacher{@Override
	public void teach() {
	// TODO Auto-generated method stub
		System.out.println("�ΰ�2�� ����ģ��");
	}
}

class Person3 implements Student, Teacher{
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("�ΰ�3�� �����Ѵ�.");
	}@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("�ΰ�3�� ����ģ��");
	}
}
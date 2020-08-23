package Lombok;

import lombok.Builder;

public class Lombok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per1 = Person.builder().no(1).build();
		Person per2 = Person.builder().no(2).name("Jinwoo").build();
		Person per3 = Person.builder().no(3).name("ny").phone("010-1236-4567").build();
		Person per4 = new Person(4,"ny","010-1234-5678");
	}

}


class Person {
	private final int no;
	private String name;
	private String phone;

	@Builder
	public Person(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	
	
}

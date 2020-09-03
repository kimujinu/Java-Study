package CollectionFramework_example;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set Hashset = new HashSet();
		Hashset.add("Áßº¹°ª");
		Hashset.add("Áßº¹°ª");
		Hashset.add("Áßº¹°ª");
		Hashset.add(new Student("±èÁø¿ì",4));
		Hashset.add(new Student("±è³ª·Õ",2));
		
		System.out.println("Hashset : "+Hashset);
	}
}


class Student {
	private String name;
	private int number;
	
	public Student(String name,int number) {
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
}

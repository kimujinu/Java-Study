package CollectionFramework_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

public class Comparable_Sample {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"��ǳ"));
		list.add(new Employee(3,"����"));
		list.add(new Employee(2,"����"));
		
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}
	
}

@Data
class Employee implements Comparable<Employee>{
	private int number;
	private String name;
	
	@Override
	public int compareTo(Employee o) {
		//return this.number - o.number; //������
		//return o.number - this.number; //������
		return this.name.compareTo(o.name);//������
		//return o.name.compareTo(this.name);
	}

	public Employee(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
}

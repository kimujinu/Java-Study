package CollectionFramework_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

public class Comparable_Sample {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"태풍"));
		list.add(new Employee(3,"번개"));
		list.add(new Employee(2,"무셔"));
		
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
		//return this.number - o.number; //순정렬
		//return o.number - this.number; //역정렬
		return this.name.compareTo(o.name);//순정렬
		//return o.name.compareTo(this.name);
	}

	public Employee(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
}

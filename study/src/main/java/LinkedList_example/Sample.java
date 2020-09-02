package LinkedList_example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample {

	static List<String> list = new ArrayList<>();
	static List<String> list2 = new LinkedList<>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list.add("dog");
		list.add("cat");
		list.add("lion");
		
		list2.add("dog");
		list2.add("cat");
		list2.add("lion");
		toString("1. 순차입력");
		
		list.add(2,"tiger");
		list2.add(2,"tiger");
		toString("2. 중간삽입");
		
		list.remove(2);
		list2.remove(2);
		toString("3. 중간삭제");
	}
	
	public static void toString(String title) {
		System.out.printf("\n== %s == \n", title);
		System.out.println("ArrayList : "+list);
		System.out.println("LinkedList : "+list2);

	}
}

package ArrayList_example;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		
		arr.add("�ϳ�");
		arr.add("��");
		arr.add("��");
		
		arr.add(2,"�� �� ��");
		arr.set(2, "�� �� ��");
		
		for(String a : arr) System.out.println(a);
		
		arr.remove(2);
		System.out.println("=====================");
		for(String a : arr) System.out.println(a);
		
		List<String> delArr = new ArrayList<>();
		delArr.add("��");
		delArr.add("��");
		arr.removeAll(delArr);
		System.out.println("=====================");
		for(String a : arr) System.out.println(a);
		
		arr.removeAll(arr);
		System.out.println("=====================");
		for(String a : arr) System.out.println(a);
		
	}

}

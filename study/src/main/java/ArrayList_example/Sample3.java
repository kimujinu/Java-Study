package ArrayList_example;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		
		arr.add("�ϳ�");
		arr.add("��");
		arr.add("��");
		
		arr.add(2,"�� �� ��");
		arr.set(2, "�� �� ��");
		
		for(String a : arr) System.out.println(a);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		
	}

}

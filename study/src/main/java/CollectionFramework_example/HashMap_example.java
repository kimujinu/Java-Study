package CollectionFramework_example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> HashMap = new HashMap<>();
		
		HashMap.put("������", "010-1234-5678");
		HashMap.put("�質��", "010-6548-1348");
		HashMap.put("�����", "010-4345-3486");
		
		// Map���� Key ���� ��������
		Set<String> names = HashMap.keySet();
		System.out.println("�ּҷϿ� �ִ� ����� : "+ names);
		
		// Map���� value ���� ��������
		Collection<String> numbers = HashMap.values();
		System.out.println("�ּҷ���ȭ��ȣ ���� : "+ numbers);
		System.out.println();
		
		// Map���� Entry�����ͼ�, Entry���� key�� value ��������
		Set<Map.Entry<String, String>> entrySet = HashMap.entrySet();
		Iterator<Map.Entry<String,String>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> entry = iter.next();
			System.out.println("�ּҷϿ� �ִ� ����� : "+ entry.getKey());
			System.out.println("�ּҷ���ȭ��ȣ ���� : "+ entry.getValue());
		}
		
		
		
	}

}

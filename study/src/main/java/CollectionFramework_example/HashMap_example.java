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
		
		HashMap.put("김지누", "010-1234-5678");
		HashMap.put("김나봉", "010-6548-1348");
		HashMap.put("김시한", "010-4345-3486");
		
		// Map에서 Key 모음 가져오기
		Set<String> names = HashMap.keySet();
		System.out.println("주소록에 있는 사람들 : "+ names);
		
		// Map에서 value 모음 가져오기
		Collection<String> numbers = HashMap.values();
		System.out.println("주소록전화번호 모음 : "+ numbers);
		System.out.println();
		
		// Map에서 Entry가져와서, Entry에서 key와 value 가져오기
		Set<Map.Entry<String, String>> entrySet = HashMap.entrySet();
		Iterator<Map.Entry<String,String>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> entry = iter.next();
			System.out.println("주소록에 있는 사람들 : "+ entry.getKey());
			System.out.println("주소록전화번호 모음 : "+ entry.getValue());
		}
		
		
		
	}

}

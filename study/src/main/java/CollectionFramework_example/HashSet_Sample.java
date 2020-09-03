package CollectionFramework_example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intarr = {4,4,5,6,1,1,1,2,2,2,3,4,5};
		
		// HashSet�� �ߺ��� ������� �ʰ� ��������� ���������ʴ´�.
		Set<Integer> Hashset = new HashSet<>();
		for(Integer i : intarr) {
			Hashset.add(i);
		}
		
		System.out.println("HashSet : "+Hashset);
		
		//LinkedHashSet�� �̿��ϸ� ��������� ������ �� �ִ�.
		Set<Integer> linkedSet = new LinkedHashSet<>();
		for(Integer i: intarr) {
			linkedSet.add(i);
		}
		
		System.out.println("linkedHashSet : "+linkedSet);
		
	}

}

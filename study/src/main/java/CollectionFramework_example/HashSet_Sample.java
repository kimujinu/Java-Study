package CollectionFramework_example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intarr = {4,4,5,6,1,1,1,2,2,2,3,4,5};
		
		// HashSet은 중복을 허용하지 않고 저장순서가 유지되지않는다.
		Set<Integer> Hashset = new HashSet<>();
		for(Integer i : intarr) {
			Hashset.add(i);
		}
		
		System.out.println("HashSet : "+Hashset);
		
		//LinkedHashSet을 이용하면 저장순서를 유지할 수 있다.
		Set<Integer> linkedSet = new LinkedHashSet<>();
		for(Integer i: intarr) {
			linkedSet.add(i);
		}
		
		System.out.println("linkedHashSet : "+linkedSet);
		
	}

}

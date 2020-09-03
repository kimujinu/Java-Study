package CollectionFramework_example;

import java.util.TreeSet;

public class TreeSet_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> Treeset = new TreeSet<>();//Binary search tree 자료구조 형태
		
		String from = "b";
		String to = "e";
		
		Treeset.add("abc");
		Treeset.add("aff");
		Treeset.add("bar");
		Treeset.add("car");
		Treeset.add("Car");
		Treeset.add("detect");
        Treeset.add("daaaaa");
        Treeset.add("dzzzzz");
        Treeset.add("ear");
        Treeset.add("edd");
        Treeset.add("zzz");
        
        /*
        headSet(Object toElement) => 지정된 객체보다 작은 값의 객체들을 반환한다.
        subSet(Object from, Object to) => 범위 검색의 결과를 반환한다. (끝 범위인 toElement는 범위에 포함되지 않음)
        tailSet(Object fromElement) => 지정된 객체보다 큰 값의 객체들을 반환한다. 
        */
        System.out.println(Treeset);
        System.out.println(Treeset.subSet(from, to)); 
        System.out.println(Treeset.subSet(from, to + "zzzzz"));
		
	}

}

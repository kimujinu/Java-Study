package CollectionFramework_example;

import java.util.TreeSet;

public class TreeSet_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> Treeset = new TreeSet<>();//Binary search tree �ڷᱸ�� ����
		
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
        headSet(Object toElement) => ������ ��ü���� ���� ���� ��ü���� ��ȯ�Ѵ�.
        subSet(Object from, Object to) => ���� �˻��� ����� ��ȯ�Ѵ�. (�� ������ toElement�� ������ ���Ե��� ����)
        tailSet(Object fromElement) => ������ ��ü���� ū ���� ��ü���� ��ȯ�Ѵ�. 
        */
        System.out.println(Treeset);
        System.out.println(Treeset.subSet(from, to)); 
        System.out.println(Treeset.subSet(from, to + "zzzzz"));
		
	}

}

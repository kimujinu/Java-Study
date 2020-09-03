package CollectionFramework_example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet2_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> TreeSet = new TreeSet<>();
		TreeSet<Integer> TreeSet2 = new TreeSet<>(new Descending());
		
		Integer[] scores = {30,50,10,20,40};
		
		for(int i=0;i<scores.length;i++) {
			TreeSet.add(i);
			TreeSet2.add(i);
		}
		
		System.out.println("TreeSet1 : "+TreeSet);
		System.out.println("TreeSet2 : "+TreeSet2);
		
	}

}

class Descending implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			
			return c1.compareTo(c2)* -1;
			// -1을 곱해서 정렬방식의 역으로 변경 또는 c2.compareTo(c1) 으로 변경한다.
		}
		
		return -1;
	}
	
}
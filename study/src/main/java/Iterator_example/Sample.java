package Iterator_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("dog");
		list.add("cat");
		list.add("lion");
		
		System.out.println("1. forEach");
		list.forEach((String x)->System.out.println(x));
		
		System.out.println("======================");
		System.out.println("2. for");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======================");
		System.out.println("3. 향상된 for");
		for(String x : list) {System.out.println(x);}
		
		System.out.println("======================");
		System.out.println("4. Iterator");
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======================");
		System.out.println("5. Iterator(Lambda)");
		Iterator it2 = list.iterator();
		it2.forEachRemaining(x->System.out.println(x));
		
		System.out.println("======================");
		System.out.println("6. Iterator(참조 메서드)");
		Iterator it3 = list.iterator();
		it3.forEachRemaining(System.out::println);
		
		System.out.println("======================");
		System.out.println("7. order");
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.toString());

	}

}

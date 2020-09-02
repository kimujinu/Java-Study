package ArrayList_example;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>();
		
		arr.add("하나");
		arr.add("둘");
		arr.add("셋");
		
		arr.add(2,"둘 쩜 오");
		arr.set(2, "이 쩜 오");
		
		for(String a : arr) System.out.println(a);
		
		arr.remove(2);
		System.out.println("=====================");
		for(String a : arr) System.out.println(a);
		
		List<String> delArr = new ArrayList<>();
		delArr.add("둘");
		delArr.add("셋");
		arr.removeAll(delArr);
		System.out.println("=====================");
		for(String a : arr) System.out.println(a);
		
		arr.removeAll(arr);
		System.out.println("=====================");
		for(String a : arr) System.out.println(a);
		
	}

}

package Stack_example;

import java.util.Stack;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.push("dog");
		stack.push("cat");
		stack.push("lion");
	
		System.out.printf("총 %d개 의 자료가 있습니다.\n",stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.printf("총 %d개 의 자료가 있습니다.",stack.size());
	}

}

package Stack_example;

import java.util.Stack;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.push("dog");
		stack.push("cat");
		stack.push("lion");
	
		System.out.printf("�� %d�� �� �ڷᰡ �ֽ��ϴ�.\n",stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.printf("�� %d�� �� �ڷᰡ �ֽ��ϴ�.",stack.size());
	}

}

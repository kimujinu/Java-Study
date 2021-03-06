package extends_example;

import java.util.UUID;
import java.util.stream.Stream;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String legacyKey = LegacyUtil.getRandom();
		System.out.printf("레거시 시스템에서 처리될 키값은 %s 입니다.\n", legacyKey);
		
		for(int i=0;i<5;i++) {
			String key = NewUtil.getRandom();
			System.out.printf("새로운 시스템에서 처리될 키값은 %s 입니다.\n", key);
		}
		NewUtil.test();
		System.out.println("==========================================");
		Stream.generate(UUID::randomUUID)
		       .limit(5)
			   .forEach(x -> System.out.printf("더 새로운 시스템에서 처리될 키값은 %s 입니다.\n", x));
	}

}

class LegacyUtil{
	public static String getRandom() {
		return ""+(int)(Math.random() * 10 + 1);
	}
	public static void test() {
		System.out.println("test");
	}
}

class NewUtil extends LegacyUtil{
	public static String getRandom() {
		return ""+UUID.randomUUID();
	}
	
}

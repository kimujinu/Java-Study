package extends_example;

import java.util.UUID;
import java.util.stream.Stream;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String legacyKey = LegacyUtil.getRandom();
		System.out.printf("���Ž� �ý��ۿ��� ó���� Ű���� %s �Դϴ�.\n", legacyKey);
		
		for(int i=0;i<5;i++) {
			String key = NewUtil.getRandom();
			System.out.printf("���ο� �ý��ۿ��� ó���� Ű���� %s �Դϴ�.\n", key);
		}
		System.out.println("==========================================");
		Stream.generate(UUID::randomUUID)
		       .limit(5)
			   .forEach(x -> System.out.printf("�� ���ο� �ý��ۿ��� ó���� Ű���� %s �Դϴ�.\n", x));
	}

}

class LegacyUtil{
	public static String getRandom() {
		return ""+(int)(Math.random() * 10 + 1);
	}
}

class NewUtil extends LegacyUtil{
	public static String getRandom() {
		return ""+UUID.randomUUID();
	}
	
}

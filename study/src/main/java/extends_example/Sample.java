package extends_example;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String legacyKey = Util.getRandom();
		System.out.printf("���Ž� �ý��ۿ��� ó���� Ű���� %s �Դϴ�.\n", legacyKey);
		
		for(int i=0;i<5;i++) {
			String key = Util.getRandom();
			System.out.printf("���ο� �ý��ۿ��� ó���� Ű���� %s �Դϴ�.\n", key);
		}
	}

}

class Util{
	public static String getRandom() {
		return ""+(int)(Math.random() * 10 + 1);
	}
}

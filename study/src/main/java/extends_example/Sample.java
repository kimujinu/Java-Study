package extends_example;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String legacyKey = Util.getRandom();
		System.out.printf("레거시 시스템에서 처리될 키값은 %s 입니다.\n", legacyKey);
		
		for(int i=0;i<5;i++) {
			String key = Util.getRandom();
			System.out.printf("새로운 시스템에서 처리될 키값은 %s 입니다.\n", key);
		}
	}

}

class Util{
	public static String getRandom() {
		return ""+(int)(Math.random() * 10 + 1);
	}
}

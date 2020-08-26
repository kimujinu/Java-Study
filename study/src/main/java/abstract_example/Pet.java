package abstract_example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Pet {
	private boolean wing;
	@Getter
	private int legcount;
	
	public String isWing() {
		String str;
		
		if(this.wing) {
			str = "�����ִ�.";
		}else {
			str = "�ѹ���";
		}
		
		return str;
	}

	public abstract void run(String name);
	
}

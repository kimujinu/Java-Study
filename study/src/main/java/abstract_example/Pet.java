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
			str = "³¯¼öÀÖ´Ù.";
		}else {
			str = "¶Ñ¹÷ÀÌ";
		}
		
		return str;
	}

	public abstract void run(String name);
	
}

package abstract_example;

public class PetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet cat = new Cat(false,4);
		cat.run(getPetName(cat));
		Pet parrot = new Parrot(true,2);
		parrot.run(getPetName(parrot));
		
		Parrot pr = (Parrot) parrot;
		pr.fly(getPetName(pr));
		
		Pet pet = pr;
	
	}
	
	public static String getPetName(Pet pet) {
		String str = "";
		
		if(pet instanceof Cat) {
			str = "고양이";
		}else if (pet instanceof Parrot) {
			str = "앵무새";
		}
		
		return str;
	}

}

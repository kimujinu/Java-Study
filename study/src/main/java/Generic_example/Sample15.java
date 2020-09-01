package Generic_example;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Sample15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group<Pet> petGroup = new Group<>();
		petGroup.add(new Pet("�޹���"));
		petGroup.add(new Pet("���ڸ�"));

		Group<Wild> wildGroup = new Group<>();
		wildGroup.add(new Wild("��ġ"));
		wildGroup.add(new Wild("��ѱ�"));
		
		System.out.println("�ֿ��� ===");
		getAnimalList(petGroup);
		System.out.println("---");
		getPetList(petGroup);
		
		
		System.out.println("�߻��� ===");
		getAnimalList(wildGroup);
	}
	
	public static void getAnimalList(Group<? extends Animal> group) {
		Object[] g = group.getGroup();
		for(int i=0;i<g.length;i++) {
			Animal animal = (Animal) g[i];
			System.out.println(animal.getName());
		}
	}
	
	public static void getPetList(Group<? super Pet> group) {
		Object[] g = group.getGroup();
		for(int i=0;i<g.length;i++) {
			Pet pet = (Pet) g[i];
			System.out.println(pet.getName());
		}
	}

}

class Group<G>{
	private int listCount = 0;
	private G[] group = (G[]) new Object[listCount];
	
	public void add(G g) {
		group = Arrays.copyOf(group, ++listCount);
		group[listCount -1] = g;
	}

	public G[] getGroup() {
		return group;
	}
	
}


@AllArgsConstructor
@Getter
class Animal {
	private String name;
}

class Pet extends Animal{

	public Pet(String name) {
		super(name);
	}
}

class Wild extends Animal{

	public Wild(String name) {
		super(name);
	}
}
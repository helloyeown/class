package chapter05;

public class ModifierPrivateMain {

	public static void main(String[] args) {
		
		ModifierPrivate mp = new ModifierPrivate("문예원", 29);
		
		//mp.age = 29;
		//mp.name = "문예원";
		
		mp.tell();
		
	}
}

package chapter05.other;

import chapter05.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected {
		// ModifierProtected ctrl+space (자동 import)
		// name, age, tell() 상속됨
	
	public static void main(String[] args) {
		
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "문예원";
		mpe.age = 29;
		mpe.tell();
	}
}

package OOP;

class Animal {
}

class Monkey extends Animal {
}

public class InheritanceTestReference {
	public void methodOne(Animal a) {
		System.out.println("Animal version");
	}

	public void methodOne(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		InheritanceTestReference t = new InheritanceTestReference();
		Animal a = new Animal();
		t.methodOne(a);// Animal version
		Monkey m = new Monkey();
		t.methodOne(m);// Monkey version
		Animal a1 = new Monkey();
		t.methodOne(a1);// Animal version
	}
}

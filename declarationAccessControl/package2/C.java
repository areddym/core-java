package declarationAccessControl.package2;

import static java.lang.System.out;

import declarationAccessControl.package1.A;

public class C extends A  {
	
	public void someMethod() {
		
		A a = new A();
		//a.protedMethod();
		out.println(a.protectedInt);
		out.println(protectedInt);
		out.println(A.protectedInt);
		C c = new C();
		c.protedMethod();
		protedMethod();
	}

	public static void main(String[] args) {
		
		new C().someMethod();
	}

}

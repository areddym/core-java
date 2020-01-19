package declarationAccessControl.package2;
import declarationAccessControl.package1.*;
import static java.lang.System.out;
public class B {
	public static void main(String[] args) {
		A a = new A();
		a.method1();
		//out.println(a.protectedInt);
		//a.defaultMethod();
		//a.protedMethod();protected not visible here
	}

}

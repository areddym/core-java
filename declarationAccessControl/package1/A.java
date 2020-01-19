package declarationAccessControl.package1;
import static java.lang.System.out;
public class A {
	protected static int protectedInt=100;
	public void method1() {
		out.println("method 1 executed...");
	}
	protected void protedMethod() {
		out.println("protedMethod  executed...");
	}
	void defaultMethod() {
		out.println("defaultMethod  executed...");
	}

}

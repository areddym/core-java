package declarationAccessControl.package1;
//import declarationAccessControl.package1.A;
import static java.lang.System.out;
public class D {

	public static void main(String[] args) {
		A a = new A();
		a.protedMethod();
		a.defaultMethod();
		out.println(A.protectedInt);
		
	}
}

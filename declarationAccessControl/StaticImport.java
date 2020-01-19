package declarationAccessControl;

import static java.lang.Math.*;
import static java.lang.System.out;
public class StaticImport {

	public static void main(String[] args) {
		System.out.println(sqrt(4));
		System.out.println(max(10,20));
		System.out.println(random());
		out.println("this is also printed...");
	}
}

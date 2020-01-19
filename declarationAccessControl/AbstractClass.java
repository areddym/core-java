package declarationAccessControl;
import static java.lang.System.out;
public abstract class AbstractClass {
	
	public abstract void method1();
	
	public  void method2() {
		out.println("Helloo 2");
	}
	public static void main(String[] args) {
		
		out.println("Helloo");
		//new AbstractClass().method2();
	}
}

/*If a class contain at least on abstract method then compulsory 
the corresponding class should be declare with 
abstract modifier. Because implementation is not complete 
and hence we can’t create object of that class.*/

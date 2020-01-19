package OOP;
import static java.lang.System.out;
public class InheritanceTest {

	public static void main(String[] args) {
		A a= new B();
		out.println(a.method1(2));
		out.println(a.i);
		
		B b= (B)a;
		out.println(b.i);
		//B b=(B) new A();
		//out.println(b.method1(2));
		out.println("end");
	}

	
	
}

class A{
	int i=100;
	
	static{
		out.println("class A static flow...");
	}
	
	{
		out.println("class A instance flow...");
	}
	public int method1(int j) {
		return i;
	}
	public float method1(float j) {
		return i;
	}
	
	A(){
		out.println("class A constructer...");
	}
	
	
}

class B extends A{
	
	static{
		out.println("class B static flow...");
	}
	{
		out.println("class B instance flow...");
	}
	
	int i=99;
	public int method1(int j) {
		return i;
	}
	B(){
		out.println("class B constructer...");
	}
}

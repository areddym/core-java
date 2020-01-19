package OOP;

public class OverridenTest {

	public static void main(String[] args) {
		
		
		//Parent p = new Child();
		
		

	}

}

 class Parent{
	public int method1(int j) {
		return j;
	}
	public int method1(int j,int k) {//if change inreturn type error but argument change no error
		return j;
	}
	
}
 abstract class Child extends Parent{
	public int method1(int j) {//if change inreturn type error but argument change no error
		return j;
	}
	public abstract int method1(int j,int k) ;
}

package OOP;

public class OverloadingTest {

	public static void main(String[] args) {
		new OverloadingTest().methodOne(55);

	}
	
	/*public void methodOne(int i)
	{
	System.out.println("int-arg method");
	}*/
	public void methodOne(float f) {
		System.out.println("float-arg method");
	}
	
/*	public void methodOne(long l) {
		System.out.println("long-arg method");
	}*/

}

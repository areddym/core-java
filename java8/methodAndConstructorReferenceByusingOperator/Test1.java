package java8.methodAndConstructorReferenceByusingOperator;
interface Interef{
	Test1 getTest1();
}

public class Test1 {
	
	Test1(String s){
		System.out.println("arg const");
	}
	Test1(){
		System.out.println("---Test class without argument constructor---");
	}

	public static void m1() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}
	public  void m2() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread 2");
		}
	}
	public static void main(String[] args) {
		//static
		Runnable r=Test1::m1;
		new Thread(r).start();
		
		//non static
		Test1 test1 = new Test1();
		Runnable r2=test1::m2;
		new Thread(r2).start();
		
		//constructor
		
		
		Runnable r3=Test1::new;
		new Thread(r3).start();
		
		//one more...
		
		Interef interef =Test1::new;
		Test1 t= interef.getTest1();
		t.m2();
		
		
	}

}

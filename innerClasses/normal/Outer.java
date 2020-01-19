package innerClasses.normal;

class Outer {
	class Inner {
		
		//below is the error
		
		/*Inside inner class we can’t declare static members.
		Hence it is not possible to declare main() method
		and we can’t invoke inner class directly from the 
		commend prompt.*/
		
		/*public static void main(String[] args) {
			System.out.println("inner class main method");
		}*/
	}

}

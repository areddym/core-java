package java8.LambdaExpressionsFunctionalInterfaces;

 interface Interf {
	public void methodOne();
}
//normal way
	/*class Demo implements Interf {
	public void methodOne() { 
			System.out.println("method exec"); 
		}
	}
	public class Pr1 { 
		public static void main(String[] args) {
			Interf i = new Demo(); 
			i.methodOne(); 
		
}
}*/
//Lambda way
	public class Pr1 { 
		public static void main(String[] args) {
			Interf i = ()->System.out.println("method exec");
			i.methodOne(); 
		
		}
	}
 

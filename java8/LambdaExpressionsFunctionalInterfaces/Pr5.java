package java8.LambdaExpressionsFunctionalInterfaces;

/* interface Interf5 {
	public int len(String s);
}*/

//Lambda way
	public class Pr5 { 
		public static void main(String[] args) {
		/*	Interf5 interef = (s)->  s.length();
			//Interf4 interef = (s)-> {return s.length();};
			int k=interef.len("Hello"); 
			System.out.println(k);*/
			
			Runnable r = ()->{
				for(int f=0;f<10;f++) {
				System.out.println("child ...");
				}
			};
			Thread t = new Thread(r);
			t.start();
			for(int f=0;f<10;f++) {
			System.out.println("in main");}
		}
	}
 

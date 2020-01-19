package java8.LambdaExpressionsFunctionalInterfaces;

 interface Interf4 {
	public int len(String s);
	
}

//Lambda way
	public class Pr4 { 
		public static void main(String[] args) {
			Interf4 interef = (s)->  s.length();
			//Interf4 interef = (s)-> {return s.length();};
			int k=interef.len("Hello"); 
			System.out.println(k);
		
		}
	}
 

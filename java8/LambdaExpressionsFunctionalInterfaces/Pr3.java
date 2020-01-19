package java8.LambdaExpressionsFunctionalInterfaces;

 interface Interf3 {
	public int squre(int i);
}

//Lambda way
	public class Pr3 { 
		public static void main(String[] args) {
			//Interf3 interef = (i)->i*i;
			Interf3 interef = i-> {return i*i;};
			//Interf3 interef = (i)-> {return i*i;};
			int k=interef.squre(2); 
			System.out.println(k);
		
		}
	}
 

package java8.LambdaExpressionsFunctionalInterfaces;

 interface Interf2 {
	public void sum(int i,int j);
}

//Lambda way
	public class Pr2 { 
		public static void main(String[] args) {
			Interf2 i2 = (i,j)->System.out.println("sum is "+(i+j));
			i2.sum(2,3); 
		
		}
	}
 

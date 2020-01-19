package java8.predefinedFunctionalInterfacesFunction;

import java.util.function.Function;

public class Test1 {

	public static void main(String[] args) {
		Function<String,Integer> f1=(s)->s.length();
		System.out.println(f1.apply("anand"));
		
		//Program to find Number of spaces present in the given 
		//String by using Function:
		
		Function<String,Integer> f2=(s)->s.length()-s.replaceAll(" ", "").length();
		System.out.println(f2.apply("anand mohan reddy"));
		

	}

}

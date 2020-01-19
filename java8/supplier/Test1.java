package java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Test1 {

	public static void main(String[] args) {
		
		
		Supplier<String> s=()->{
			String[] names= {"anand","anand2","anand3",};
			
			int j=(int) (Math.random()*3);
			return names[j];
		};
		
		
		System.out.println(s.get());
		
		
		
		
		
		Supplier<Date> s2= ()->{
			
			Date d= new Date();
			return d;
		};
		System.out.println(s2.get());

	}

}

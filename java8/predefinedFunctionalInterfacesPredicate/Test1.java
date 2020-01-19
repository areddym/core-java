package java8.predefinedFunctionalInterfacesPredicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		
		Predicate<Integer> p1= (i)->i>10;
		System.out.println(p1.test(100));
		
		Predicate<Collection> p2= (c)->c.isEmpty();
		System.out.println(p2.test(new ArrayList<>()));
		
		Predicate<Integer> p3= (i)->i%10==0;
		System.out.println(p3.test(101));
		
		Predicate<Integer> p4= (i)->{int z=10;return i%z==0;};
		System.out.println(p4.test(100));	
		
		System.out.println(p1.and(p3).test(103));
		
	}

}

package java8.biPredicateBiFunctionBiConsume;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p1=(i,j)->(i+j)%2==0;

		System.out.println(p1.test(10, 20));
		System.out.println(p1.test(10, 21));
		
	}

}

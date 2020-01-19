package java8.unaryOperatorAndBinaryOperator;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class intPredicateTest {

	public static void main(String[] args) {
		IntPredicate p= (i)->i%2==0;
		System.out.println(p.test(11));
		
		LongPredicate p2= (l)->l%2==0;
		System.out.println(p2.test(100));

	}

}

package java8.unaryOperatorAndBinaryOperator;

import java.util.function.UnaryOperator;

public class UneryOperatorTest {

	public static void main(String[] args) {
		UnaryOperator<Integer> f= (i)->i*i;
		
		System.out.println(f.apply(6));

	}

}

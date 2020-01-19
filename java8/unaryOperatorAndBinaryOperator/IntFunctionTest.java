package java8.unaryOperatorAndBinaryOperator;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class IntFunctionTest {

	public static void main(String[] args) {
		IntFunction<String> f= (i)->""+i*i;
		System.out.println(f.apply(4));
		
		IntToDoubleFunction f2=(i)->Math.sqrt(i);
		System.out.println(f2.applyAsDouble(7));

	}

}

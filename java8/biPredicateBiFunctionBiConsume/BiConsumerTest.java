package java8.biPredicateBiFunctionBiConsume;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		
		BiConsumer<String, String> c=(s1,s2)->System.out.println(s1+s2);
		
		c.accept("anand", "reddy");
		

	}

}

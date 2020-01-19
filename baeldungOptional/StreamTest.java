package baeldungOptional;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3);
		Integer reduced = integers.stream().reduce(100, (a, b) -> a - b);
		
		System.out.println(reduced);

	}

}

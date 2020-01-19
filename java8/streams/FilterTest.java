package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		
		
		List<Integer> list=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
	}

}

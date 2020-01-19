package misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		/*List<Integer> ls = Arrays.asList(2,6,4,2,3,1,9,10);
		System.out.println(ls);
		
		System.out.println(ls.stream().filter(s->s%2==0).collect(Collectors.toList()));*/
		
		 String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

	        //Stream<String[]>
	        Stream<String[]> temp = Arrays.stream(data);

	        //filter a stream of string[], and return a string[]?
	        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

	        stream.forEach(System.out::println);
	        
	        
	        
	     //  data.flatMap(x->Arrays.stream(x)).filter(x -> "a".equals(x.toString())).forEach(System.out::println);
	        
		System.out.println("end");
	}

}

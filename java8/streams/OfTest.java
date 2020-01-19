package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfTest {

	public static void main(String[] args) {
		
		String s="1,2,3,4,5,6,7,8";
		Double[] d={10.0,10.1,10.2,10.3};
		//Stream s1=Stream.of(d);
		Stream s1=Stream.of(s);
		s1.forEach(System.out :: println);
		
		 
		//interview BT
		
		String s2="1-2-3-4";
		Stream s3=Pattern.compile("-").splitAsStream(s2);
				//Stream.of(s2);
		s3.filter(p->!p.equals(4)).forEach(System.out :: println);
		
		
		Stream<String> stream = 
				  Stream.of("a", "b", "c").filter(element -> element.contains("b"));
				Optional<String> anyElement = stream.findAny();
				System.out.println(anyElement);
				//Optional<String> firstElement = stream.findFirst();
				
				List<String> list = Arrays.asList("abc4","def4","ghe3");
				//Optional<String> stream2 = list.stream().filter(element -> {
				List<String> listAltered = list.stream().filter(element -> {
					System.out.println("filter() was called");
				    return element.contains("4");
				}).map(element -> {
					System.out.println("map() was called");
				    return element.toUpperCase();
				//}).findFirst();
				}).collect(Collectors.toList());
				
				listAltered =  list.stream().skip(2).map(element -> {
				    wasCalled();
				    return element.substring(0, 3);
				}).collect(Collectors.toList());
				System.out.println(listAltered);
				
				
				/*long size = list.stream().map(element -> {
				    wasCalled();
				    return element.substring(0, 3);
				}).skip(2).count();*/
				
				System.out.println(counter);
				//System.out.println(size);
				
				
		List<String> l= Arrays.asList("abc4","def4","ghe3");
		
		String[] sa=l.stream().toArray(String[] ::new);
		
		
			
				
				
	}
	private static long counter;
	  
	private static void wasCalled() {
	    counter++;
	}
}

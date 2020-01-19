package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("rvk"); 
		l.add("rk"); 
		l.add("rkv"); 
		l.add("rvki"); 
		l.add("rvkir");
		System.out.println(l);
		
		List<String> list=l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list);
	}

}

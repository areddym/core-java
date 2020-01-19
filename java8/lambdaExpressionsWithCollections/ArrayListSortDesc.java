package java8.lambdaExpressionsWithCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDesc {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println("Before Sorting:" + l);
		Collections.sort
				(
				l,
				 (i1,i2)-> {return (i1>i2)?-1:(i1<i2)?1:0;}
				);
		//Collections.sort(l, (i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0);
		System.out.println("After Sorting:" + l);
	}
}

package java8.biPredicateBiFunctionBiConsume;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f1 = (i, j) -> i * j;

		System.out.println(f1.apply(10, 25));

		BiFunction<String, Integer, Student> f2=(i,s)->new Student(i,s);
		Student student= f2.apply( "anand",100);
		System.out.println(student.name);
		System.out.println(student.rollno);
	}
	
	

}

class Student {
	String name;
	int rollno;

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}
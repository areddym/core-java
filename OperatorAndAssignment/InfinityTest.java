package OperatorAndAssignment;
import static java.lang.System.out;

import java.awt.geom.Arc2D.Double;
public class InfinityTest {

	public static void main(String[] args) {
		
		out.println(-10/0.0);//-Infinity
		//out.println(10/0);//error
		double d= 12f;
		
		//out.println(0/0);//error
		out.println(0.0/0);
		int x=10; 
		System.out.println(x>Float.NaN);//false 
		System.out.println(x<Float.NaN);//false 
		System.out.println(x>=Float.NaN);//false 
		System.out.println(x<=Float.NaN);//false 
		System.out.println(x==Float.NaN);//false
		
		System.out.println(x!=Float.NaN);//true 
		System.out.println(Float.NaN!=Float.NaN);//true
		
	}

}

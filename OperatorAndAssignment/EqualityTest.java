package OperatorAndAssignment;
import static java.lang.System.out;
public class EqualityTest {

	public static void main(String[] args) {
		Object o= new Object();
		String s= new String();
		StringBuffer sb= new StringBuffer();
		out.println(o==s);
		//out.println(s==sb);Error- incomaptible types
		
		int a,b,c,d;
		a=b=c=d=20;
		out.println(a);
		out.println(b);
		out.println(c);
		out.println(d);
		
		a+=b-=c*=d/=2;
		out.println(a);
		out.println(b);
		out.println(c);
		out.println(d);
	}

}

package langFundamental;

import static java.lang.System.out;
public class ScopeTest {
	static int  j;
	int k=100;
	{
		k=500;
		int instanceVar=2000;
		out.println(instanceVar);
	}
	
	public static void main(String[] args) {
		
		{
			int i=200;
			//int k=300;
			out.println(i);
			out.println(new ScopeTest().k);
		}
		//out.println(k);
		//out.println(new ScopeTest().instanceVar);
		out.println(j);
		
		out.println("End");
	}

}

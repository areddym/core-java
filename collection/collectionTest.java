package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionTest {

	public static void main(String[] args)
	{
	ArrayList a=new ArrayList();
	
	for(int i=0;i<=10;i++)
	{
		
		a.add(i);
	}
	
	System.out.println(a);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	
	Iterator itr=a.iterator();
	//ListIterator itr=a.listIterator();
	while(itr.hasNext())
	{
	int i=(Integer)itr.next();
	
	/*if(i==1) {
		System.out.println("true");
		itr.set(100);
	}
	System.out.println(a);*/
	if(i%2==0)
	System.out.println(i);//0, 2, 4, 6, 8, 10
	else
	itr.remove();
	}
	System.out.println(a);//[0, 2, 4, 6, 8, 10]
	}
}

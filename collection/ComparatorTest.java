package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		List t=new ArrayList();
		/*t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);*/
		t.add("C");
		t.add("A");
		t.add("Z");
		t.add("K");
		
		System.out.println(t);
		
		Collections.sort(t);
		System.out.println(t);
		
		//Collections.sort(t,new DescComparatorString());
		Collections.sort(t,Collections.reverseOrder());
		System.out.println(t);
		

	}
	
	

}



class DescComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Integer a= (Integer)arg0;
		Integer b= (Integer)arg1;
		
		if(a<b) {
			return 1;
		}
		else if(a>b) {
			return -1;
		}
		else		
		return 0;
	}
	
}


class DescComparatorString implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		String a= (String)arg0;
		String b= (String)arg1;
		
		return -a.compareTo(b);
	}
	
}

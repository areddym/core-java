package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(5);
		numList.add(7);
		numList.add(9);
		numList.add(2);;
		
		Collections.sort(numList,new DescComparator());		
		
		System.out.println(numList);
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

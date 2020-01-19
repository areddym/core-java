package interviewProblems;

public class SecondLargestValueFinder {

	public static void main(String[] args) {
		secondLargest(new int[] {1, 2, 3, 4, 5, 6});

	}

	private static void secondLargest(int[] is) {
		
		int firstHighst;
		int secondHighest;
		
		for (int i = 0; i < is.length; i++) {
			for (int j = 1; j < is.length; j++) {
				if(i!=j&& is[i]>is[j]) {
					firstHighst=is[i];
					secondHighest=is[j];
				}
				
				
			}
			
		}
		
		
		
	}

}

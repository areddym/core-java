package interviewProblems;

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] arr = {10, 20, 30, 40, 50,60,70,80,90,100,110,120,130}; 
		arr=reverse(arr );
        
        print(arr);
		
		

	}

	private static void print(int[] arr) {
		for (int i : arr) {
			
			System.out.print(i+",");
			
		}
		
	}

	private static int[]  reverse(int[] arr) {
		
		 int length=arr.length;
		 
		 int temp;
		 for(int i=0;i<length/2;i++) {
			 temp=arr[length-i-1];
			 arr[length-i-1]=arr[i];
			 arr[i]=temp;
		 }
		 return arr;
	}
	private static int[]  reverse2(int[] arr) {	
		int length=arr.length;
		 int[] arr2=new int[length];		 
		 for(int i=0;i<length;i++) {
			 arr2[i]=arr[length-i-1];			 
		 }
		 return arr2;
	}

}

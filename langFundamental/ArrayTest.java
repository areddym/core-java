package langFundamental;

public class ArrayTest {

	public static void main(String[] args) {
		int[][][] i = new int[2][][];
		System.out.println(i);
		
		i[0]=new int[2][1];
		i[0][0]=new int[7];
		i[0][1]=new int[7];
		//i[0][2]=new int[7];
		System.out.println(i[0][1][0]);
		//System.out.println(i[0][1][7]);
		
		//anonymous
		
		//int [][]=
		int [][] j=new int[][]{{1,2},{3,4}};
		int [] k=new int[]{10,20,30,40};
		
		
	}

}

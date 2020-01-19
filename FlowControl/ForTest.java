package FlowControl;

public class ForTest {

	public static void main(String[] args) throws InterruptedException {
		int i=0;
		
		for(System.out.println("hello u r sleeping");i<3;i++){
			System.out.println("no boss, u only sleeping");			
		
		}
		
		for(someMethod( i);;i++){
			System.out.println("in for loop "+i+" time");
			if(i==4) {
				break;
			}
			//Thread.sleep(1000);
			System.out.println("end");
		}
		
		for(int k=0;returnCondition(i);k++){
			System.out.println("hello" +i);
			i++;
			Thread.sleep(1000);
		}

	}
	public static boolean returnCondition(int i) {
		if(i==10)
		return false;
		return true;
	}
	public static void someMethod(int i) {
		
		System.out.println("in method" + i);
	}

}

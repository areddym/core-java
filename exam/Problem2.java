package exam;

public class Problem2 {

	public int calculate(int a, int b, String action) throws Exception {
		if (b == 0) {
			throw new Exception("b is Zero");
		}

		if (action.equals("add")) {
			return a + b;
		} else if (action.equals("subtract")) {
			return a - b;
		} else if (action.equals("multiply")) {
			return a * b;
		} else if (action.equals("divide")) {
			return a / b;
		} else {
			throw new Exception("Invalid Action");
		}

	}

	public static void main(String args[]) throws Exception {
		// test
		Problem2 prob2 = new Problem2();
		// System.out.println(prob2.calculate(2, 4, "Hello"));// will get Exception
		// System.out.println(prob2.calculate(2, 0, "add"));// will get Exception
		System.out.println(prob2.calculate(2, 4, "add"));
		System.out.println(prob2.calculate(2, 4, "subtract"));
		System.out.println(prob2.calculate(2, 4, "multiply"));
		System.out.println(prob2.calculate(2, 4, "divide"));
	}
}
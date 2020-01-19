package exam;

public class Problem1 {
	
	public static String getMessage(int n) {

		String message = null;
		if (n % 2 != 0) {
			message = "Weird";
		} else {
			if (n >= 2 && n <= 5) {
				message = "not Weird";
			} else if (n >= 6 && n <= 20) {

				message = "Weird";
			} else if (n > 20) {
				message = "not Weird";
			}
		}
		return message;
	}
	public static void main(String args[]) {

		//test data
		String message2 = getMessage(3);
		String message3 = getMessage(19);
		String message1 = getMessage(2);
		String message4 = getMessage(4);
		String message5 = getMessage(5);
		String message6 = getMessage(6);
		String message7 = getMessage(21);
		String message8 = getMessage(22);
		System.out.println(message2);
		System.out.println(message3);
		System.out.println(message1);
		System.out.println(message4);
		System.out.println(message5);
		System.out.println(message6);
		System.out.println(message7);
		System.out.println(message8);

	}


}

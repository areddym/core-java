package interviewProblems;

public class DublicatesFinderInArray {

	public static void main(String[] args) {
		String[] strArray = { "Java", "JSP", "Servlets", 
				"Java", "Struts", "JSP", "JDBC" };
		
		for (int i = 0; i < strArray.length; i++) {
			
			String string = strArray[i];
			for (int j = i+1; j < strArray.length; j++) {
				if(i!=j&&string.equals(strArray[j])) {
					System.out.println("dublicate is "+string);
				}
				
			}
			
		}

	}

}







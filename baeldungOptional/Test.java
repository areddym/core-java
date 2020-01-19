package baeldungOptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		
		
		
		String nullName = "anand";
	    String name = Optional.ofNullable(nullName).orElse("john");
	    System.out.println(name);
	    
	    
	    Test test = new Test();
	    String text = "Text present";
	    
	    /*String defaultText = Optional.ofNullable(text).orElseGet(() -> "john");
	    System.out.println(defaultText);
	 
	    defaultText = Optional.ofNullable(text).orElse(new Test().getMyDefault());
	    
	    System.out.println(defaultText);*/
	    
	    
	   /* try {
	    	nullName=null;
			name=Optional.ofNullable(nullName).orElseThrow( NoSuchFieldException::new);
			System.out.println(name);
		} catch (NoSuchFieldException e) {
			
			e.printStackTrace();
		}*/
	    
	    /*System.out.println("get...");
	    nullName=null;
	    name= Optional.ofNullable(nullName).get();
	    System.out.println(name);*/
	    
	    //filter
	    
	    Integer year =2016;
	    
	    Optional<Integer> yearOptional =Optional.ofNullable(year).filter(y->y==2017);
	    
	    System.out.println(yearOptional);
	    
	    System.out.println(	priceIsInRange1(new Modem(10.0)));
	    System.out.println(priceIsInRange1(new Modem(9.9)));
	    System.out.println(priceIsInRange1(new Modem(null)));
	    System.out.println(priceIsInRange1(new Modem(15.5)));
	    System.out.println(priceIsInRange1(null));
	    
	    System.out.println("with optional filter...");
	    System.out.println(	priceIsInRange2(new Modem(10.0)));
	    System.out.println(priceIsInRange2(new Modem(9.9)));
	    System.out.println(priceIsInRange2(new Modem(null)));
	    System.out.println(priceIsInRange2(new Modem(15.5)));
	    System.out.println(priceIsInRange2(null));
	    
	    //filter with map
	    
	    List<String> companyNames = Arrays.asList(
	    	      "paypal", "oracle", "", "microsoft", "", "apple");
	    
	    Optional<List<String>> companyNamesOpt= Optional.ofNullable(companyNames);
	    int size=companyNamesOpt.map(List::size).orElse(0);
	    System.out.println(size);
	    
	    name = "baeldung";
	    Optional<String> nameOptional = Optional.of(name);
	    
	    size=nameOptional.map(String::length).orElse(0);
	    
	    System.out.println(size);
	    
	    String password = " password ";
	    //password=null;
	    boolean pwdcheck=Optional.ofNullable(password).map(String::trim).filter(p->p.equals("password")).isPresent();
	    System.out.println(pwdcheck);
	    
	     name = Optional.ofNullable(new Person("anand")).flatMap(Person::getName).orElse("");
	     System.out.println(name);
	    
	}

	
	public String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}
	
	public static boolean  priceIsInRange1(Modem modem) {
	    boolean isInRange = false;
	 
	    if (modem != null && modem.getPrice() != null
	      && (modem.getPrice() >= 10
	        && modem.getPrice() <= 15)) {
	 
	        isInRange = true;
	    }
	    return isInRange;
	}
	public static boolean  priceIsInRange2(Modem modem) {
	    boolean isInRange = false;
	 
	    Optional<Modem> optModem=Optional.ofNullable(modem);
	    
	    isInRange= optModem.map(Modem::getPrice).filter(p->(p>= 10)).filter(p->(p<= 15)).isPresent();
	    
	    return isInRange;
	}
}
 class Modem {
    private Double price;
 
    public Modem(Double price) {
        this.price = price;
    }

	public Double getPrice() {
		System.out.println(price+"....");
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
 
 class Person {
	    private String name;
	    private int age;
	    private String password;
	    
	    public Person(String name) {
			this.name=name;
		}
	    
	 
	    public Optional<String> getName() {
	        return Optional.ofNullable(name);
	    }
	 
	    public Optional<Integer> getAge() {
	        return Optional.ofNullable(age);
	    }
	 
	    public Optional<String> getPassword() {
	        return Optional.ofNullable(password);
	    }

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	 
	    
} 
package collection;

import java.util.*;

class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "bhaskar");
		m.put(t, "anand");
		System.out.println(m);// {Temp=bhaskar}
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);// {}
		Temp t1 = new Temp();
		m.put(t1, "bhaskar_updated");
		System.out.println(m);
	}
}

class Temp {
	public String toString() {
		return "Temp";
	}

	public void finalize() {
		System.out.println("finalize() method called");
	}
}

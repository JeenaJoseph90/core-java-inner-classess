package core.java.inner.classess.methodlocal;

public class MethodLocalDemo {
	
	int x = 10;
	static int y = 20;
	
	//Inner class inside non static/instance method.
	public void m1() {
		int a = 10;
		final int b = 20;
		
		// Only applicable modifiers - final/abstract/strictfp
		class Inner {
			public void display() {
				System.out.println(x); // Access non static directly.
				System.out.println(y);
				//Generally not allowed to access method non final local variable inside inner class till java 1.7.
				// System.out.println(a); // Gives error because violate effectively final.
				System.out.println(b);
			}
		}
		Inner i = new Inner();
		a = 100;
		i.display();
	}
	
	//Inner class inside static method.
	public static void m2() {
		int a = 10;
		final int b = 20;
		class Inner {
			public void display() {
				// System.out.println(x); // Can't Access non static directly.
				System.out.println(y);
				System.out.println(a); // Will not get error since Java 8 (Effectively final concept). 
				System.out.println(b);
			}
		}
		Inner i = new Inner();
		i.display();
	}
	
	public static void main(String[] args) {
		MethodLocalDemo.m2();
		MethodLocalDemo ml = new MethodLocalDemo();
		ml.m1();
	}
}

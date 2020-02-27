package core.java.inner.classess.staticinnerclass;

public class StaticInnerClassDemo {

	int x = 10;
	static int y = 20;
	
	static class Inner {
		
		// Can declare static method inside including main method.
		public static void main(String[] args) {
			System.out.println("Inner main");
		}
		public static void m1() {
			// System.out.println(x); // Not allowed to access non static members from static context.
			System.out.println(y); // Can only access static members.
			System.out.println("Inner class static method");
		}
		public void m2() {
			// System.out.println(x); // Not allowed to access non static members from static inner class.
			System.out.println(y); 
			System.out.println("Inner class instance method");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Outer Main");
		StaticInnerClassDemo.Inner i = new StaticInnerClassDemo.Inner();
		i.m2();
		StaticInnerClassDemo.Inner.m1();
	}
	
}

package core.java.inner.classess.normal;
// 7. Allowed modifiers ---- public/default/final/abstract/strictfp
public class Outer {
	int x = 10;
	static int y = 20;
	
	// 8. Allowed modifiers ---- public/default/final/abstract/strictfp + private/protected/static
	class Inner {
		int x = 100;
		// 1. Inside inner class we can't declare static but can access static directly.
		// 2. So Can't declare main method.
		// 3. Thus can't run inner class directly from command prompt.
		public void m1() {
			int x =1000;
			System.out.println("Inner class method");
			System.out.println(x); // accessing non static/instance member
			System.out.println(y); // accessing static member[Valid]
			System.out.println(x); // 9. Will print x of m1.
			System.out.println(this.x); // 10. To access instance x of inner class.
			System.out.println(Outer.this.x); // 11. To access outer class instance variable x.
		}
	}
	
	public void m2() {
		// 5. To access m1 from instance area of outer class.
		Inner i = new Inner();
		i.m1();
	}
	
	public static void main(String args[]) {
		// 4. To access m1 from static area of outer class.
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		o.m2();
	}
}

// 6. If need to access m1 outside this class-Same as static area.

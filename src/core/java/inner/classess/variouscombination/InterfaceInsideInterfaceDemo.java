package core.java.inner.classess.variouscombination;

interface Outer {
	
	public void m1();
	
	//Default its public static
	interface Inner {
		public void m2();
	}
}
//Implement outer & inner interface independently.
class Test1 implements Outer {

	// Not require to implement inner interface method.
	@Override
	public void m1() {
		System.out.println("Outer Interface method implementation.");
	}

}

class Test2 implements Outer.Inner {

	@Override
	public void m2() {
		System.out.println("Inner Interface method implementation.");
	}
	
}

public class InterfaceInsideInterfaceDemo {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		Test2 t2 = new Test2();
		t2.m2();
	}
	
}

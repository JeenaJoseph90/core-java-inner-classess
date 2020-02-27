package core.java.inner.classess.annonymous;

class Burger {
	public void display() {
		System.out.println("Plain burger");
	}
}
public class AnnonymousInnerClassDemo {

	public static void main(String[] args) {
		//Declaring a child class of burger class without name & assigning it to parent reference.
		Burger b = new Burger() {};
		b.display();
		
		Burger b1 = new Burger() {
			@Override
			public void display() {
				System.out.println("My Custom Burger");
			}
		};
		
		b1.display();
	}
	
}

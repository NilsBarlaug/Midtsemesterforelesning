package extra.package1;

public class B {
	public void method() {
		
		A a = new A();
		
		// a.privateField = 0; Ulovlig!
		a.publicField = 0;
		a.nothingField = 0;
		
	}
}

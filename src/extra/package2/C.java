package extra.package2;

import extra.package1.A;

public class C {
	public void method() {
		
		A a = new A();
		
		// a.privateField = 0; Ulovlig!
		a.publicField = 0;
		// a.nothingField = 0; Ulovlig!
		
	}
}

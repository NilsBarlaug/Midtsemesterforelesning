package extra.package1;

public class A {
	private int privateField;
	public int publicField;
	int nothingField;
	
	private void privateMethod() {
		
	}
	
	public void publicMethod() {
		
	}
	
	void nothingMethod() {
		
	}
	
	public void method() {
		
		this.privateField = 0;
		this.publicField = 0;
		this.nothingField = 0;
		
		A a = new A();
		
		a.privateField = 0;
		a.publicField = 0;
		a.nothingField = 0;
		
	}
}

package section1.part1.v3.jellybean;

public class JellyBeanBox {
	private String flavor;
	private int beanCount;
	
	public JellyBeanBox(String flavor) {
		this.flavor = flavor;
		this.beanCount = 0;
	}
	
	public void addBeans(int number) {
		if(number < 0) {
			throw new IllegalArgumentException();
		}
		this.beanCount += number;
	}
	
	public void removeBeans(int number) {
		if(number < 0 || this.beanCount < number) {
			throw new IllegalArgumentException();
		}
		this.beanCount -= number;
	}
	
	public String getFlavor() {
		return this.flavor;
	}
	
	public int getBeanCount() {
		return this.beanCount;
	}
}

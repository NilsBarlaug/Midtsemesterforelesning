package extra;

public class JellyBeanBox {
	
	private static final int CAPACITY = 1000;
	private static final double BOX_WEIGHT = 0.5;
	private static final double WEIGHT_PER_BEAN = 0.001;
	
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
		if(number + beanCount > CAPACITY) {
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
	
	public int getCapacity() {
		return CAPACITY;
	}
	
	public double getTotalWeight() {
		return BOX_WEIGHT + beanCount * WEIGHT_PER_BEAN;
	}
	
	public String toString() {
		return "<JellyBeanBox: " + beanCount + " " + flavor + ">";
	}
}

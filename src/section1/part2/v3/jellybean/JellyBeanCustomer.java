package section1.part2.v3.jellybean;

public class JellyBeanCustomer {
	private int id;
	private String name;
	public int totalBeansOrdered = 0;
	public int numberOfOrders = 0;
	
	public JellyBeanCustomer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void orderBeans(int number) {
		if(number < 0)
			throw new IllegalArgumentException();
		
		this.totalBeansOrdered += number;
		this.numberOfOrders += 1;
	}
	
	public int getTotalBeansOrdered() {
		return totalBeansOrdered;
	}
	
	public double getAverageBeansOrdered() {
		if(numberOfOrders == 0) {
			return 0;
		}
		else {
			return getTotalBeansOrdered() / (double) numberOfOrders;
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return String.format("<JellyBeanCustomer: %s(%d) %.1f>", this.name, this.id, this.getAverageBeansOrdered());
	}
	
}

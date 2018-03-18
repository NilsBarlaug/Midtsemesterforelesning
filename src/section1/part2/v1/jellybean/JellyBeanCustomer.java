package section1.part2.v1.jellybean;

import java.util.ArrayList;
import java.util.List;

public class JellyBeanCustomer {
	private int id;
	private String name;
	private List<Integer> orders = new ArrayList<>();
	
	public JellyBeanCustomer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void orderBeans(int number) {
		if(number < 0)
			throw new IllegalArgumentException();
		
		this.orders.add(number);
	}
	
	public int getTotalBeansOrdered() {
		int sum = 0;
		for(int order : orders) {
			sum += order;
		}
		
		return sum;
	}
	
	public double getAverageBeansOrdered() {
		if(orders.isEmpty()) {
			return 0;
		}
		else {
			return getTotalBeansOrdered() / (double) orders.size();
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

package section1.part1.v1.jellybean;

public class JellyBeanBox {
	public String flavor;
	public int beanCount;
	
	public void addBeans(int number) {
		this.beanCount += number;
	}
	
	public void removeBeans(int number) {
		this.beanCount -= number;
	}
}

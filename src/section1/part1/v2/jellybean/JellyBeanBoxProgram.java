package section1.part1.v2.jellybean;

public class JellyBeanBoxProgram {
	public static void main(String[] args) {
		
		JellyBeanBox box1 = new JellyBeanBox("Blueberry");
		JellyBeanBox box2 = new JellyBeanBox("Cotton Candy");
		
		System.out.println(box1.flavor + " " + box1.beanCount);
		System.out.println(box2.flavor + " " + box2.beanCount);
		
		box1.addBeans(15);
		box1.removeBeans(5);
		box2.addBeans(100);
		box1.addBeans(10);
		box2.removeBeans(20);
		
		System.out.println(box1.flavor + " " + box1.beanCount);
		System.out.println(box2.flavor + " " + box2.beanCount);
		
	}
}

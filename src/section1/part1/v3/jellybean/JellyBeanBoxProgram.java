package section1.part1.v3.jellybean;

public class JellyBeanBoxProgram {
	public static void main(String[] args) {
		
		JellyBeanBox box1 = new JellyBeanBox("Blueberry");
		JellyBeanBox box2 = new JellyBeanBox("Cotton Candy");
		
		System.out.println(box1.getFlavor() + " " + box1.getBeanCount());
		System.out.println(box2.getFlavor() + " " + box2.getBeanCount());
		
		box1.addBeans(15);
		box1.removeBeans(5);
		box2.addBeans(100);
		box1.addBeans(10);
		box2.removeBeans(20);
		
		System.out.println(box1.getFlavor() + " " + box1.getBeanCount());
		System.out.println(box2.getFlavor() + " " + box2.getBeanCount());
		
	}
}

package section2.jellybean;

public class JellyBeanIntermodalContainerProgram {

	public static void main(String[] args) {
		JellyBeanBox box1 = new JellyBeanBox("Blueberry");
		box1.addBeans(100);
		JellyBeanBox box2 = new JellyBeanBox("Cotton Candy");
		box2.addBeans(400);
		JellyBeanBox box3 = new JellyBeanBox("Blueberry");
		box3.addBeans(50);
		
		JellyBeanIntermodalContainer container = new JellyBeanIntermodalContainer();
		container.addBox(box1);
		container.addBox(box2);
		container.addBox(box3);
		
		System.out.println(container);
		for(String flavor : container.getAllFlavors()) {
			System.out.println(flavor + ": " + container.getBeanCountForFlavor(flavor) + " beans");
		}
		System.out.println("Total weight: " + container.getTotalWeight());
	}

}

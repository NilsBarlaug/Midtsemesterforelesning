package section2.shipping;

import java.util.ArrayList;
import java.util.List;

import section2.jellybean.JellyBeanBox;
import section2.jellybean.JellyBeanIntermodalContainer;

public class ContainerShipProgram {

	public static void main(String[] args) {
		JellyBeanBox box1 = new JellyBeanBox("Blueberry");
		box1.addBeans(100);
		JellyBeanBox box2 = new JellyBeanBox("Cotton Candy");
		box2.addBeans(400);
		JellyBeanBox box3 = new JellyBeanBox("Blueberry");
		box3.addBeans(50);
		JellyBeanBox box4 = new JellyBeanBox("Rainbow explosion");
		box4.addBeans(800);
		JellyBeanBox box5 = new JellyBeanBox("Rainbow explosion");
		box5.addBeans(1000);
		JellyBeanBox box6 = new JellyBeanBox("Blueberry");
		box6.addBeans(1000);
		JellyBeanIntermodalContainer container1 = new JellyBeanIntermodalContainer();
		container1.addBox(box1);
		container1.addBox(box2);
		container1.addBox(box3);
		JellyBeanIntermodalContainer container2 = new JellyBeanIntermodalContainer();
		container2.addBox(box4);
		container2.addBox(box5);
		container2.addBox(box6);
		
		List<JellyBeanIntermodalContainer> containers = new ArrayList<>();
		containers.add(container1);
		containers.add(container2);
		
		ContainerShip ship = new ContainerShip("Eddy", 100, 200000);
		System.out.println(ship);
		System.out.println("Weight load: " + ship.getTotalWeightLoad());

		ship.loadContainers(containers);
		System.out.println(ship);
		System.out.println("Weight load: " + ship.getTotalWeightLoad());

		ship.unloadContainers();
		System.out.println(ship);
		System.out.println("Weight load: " + ship.getTotalWeightLoad());
	}

}

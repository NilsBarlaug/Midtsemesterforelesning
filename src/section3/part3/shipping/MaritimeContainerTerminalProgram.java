package section3.part3.shipping;

import section3.part3.jellybean.JellyBeanBox;
import section3.part3.jellybean.JellyBeanIntermodalContainer;

import java.util.ArrayList;
import java.util.List;

import section3.part3.icecream.IceCreamIntermodalContainer;

public class MaritimeContainerTerminalProgram {

	public static void main(String[] args) {
		JellyBeanBox box1 = new JellyBeanBox("Blueberry");
		box1.addBeans(100);
		JellyBeanBox box2 = new JellyBeanBox("Cotton Candy");
		box2.addBeans(1000);
		JellyBeanIntermodalContainer container1 = new JellyBeanIntermodalContainer();
		container1.addBox(box1);
		container1.addBox(box2);
		IceCreamIntermodalContainer container2 = new IceCreamIntermodalContainer(-10);
		container2.addIceCream(1000);
		
		List<IntermodalContainer> containers = new ArrayList<>();
		containers.add(container1);
		containers.add(container2);
		
		ContainerShip ship = new ContainerShip("Eddy", 100, 200000);
		MaritimeContainerTerminal boston = new MaritimeContainerTerminal("Boston");
		MaritimeContainerTerminal rotterdam = new MaritimeContainerTerminal("Rotterdam");
		boston.addRoute(rotterdam);
		boston.addShip(ship);
		
		boston.deliverContainers(containers);
		boston.loadShip(ship, containers);
		boston.moveShip(ship, rotterdam);
		rotterdam.unloadShip(ship);
		rotterdam.pickUpContainers(containers);
	}

}

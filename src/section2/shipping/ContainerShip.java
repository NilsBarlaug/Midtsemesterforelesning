package section2.shipping;

import java.util.ArrayList;
import java.util.List;

import section2.jellybean.JellyBeanIntermodalContainer;

public class ContainerShip {
	private final String name;
	private final int containerCapacity;
	private final double weightCapacity;
	private List<JellyBeanIntermodalContainer> containers = new ArrayList<>();
	
	public ContainerShip(String name, int containerCapacity, double weightCapacity) {
		this.name = name;
		this.containerCapacity = containerCapacity;
		this.weightCapacity = weightCapacity;
	}
	
	public void loadContainers(List<JellyBeanIntermodalContainer> containersToBeLoaded) {
		if(this.containers.size() + containersToBeLoaded.size() > containerCapacity) {
			throw new IllegalArgumentException("Exceeding container capacity");
		}
		double newWeight = 0;
		for(JellyBeanIntermodalContainer container : this.containers) {
			newWeight += container.getTotalWeight();
		}
		for(JellyBeanIntermodalContainer container : containersToBeLoaded) {
			newWeight += container.getTotalWeight();
		}
		if(newWeight > weightCapacity) {
			throw new IllegalArgumentException("Exceeding weight capacity");
		}
		
		this.containers.addAll(containersToBeLoaded);
	}
	
	public List<JellyBeanIntermodalContainer> unloadContainers() {
		List<JellyBeanIntermodalContainer> unloadedContainers = new ArrayList<>(containers);
		containers.clear();
		return unloadedContainers;
	}
	
	public double getTotalWeightLoad() {
		double weight = 0;
		for(JellyBeanIntermodalContainer container : containers) {
			weight += container.getTotalWeight();
		}
		return weight;
	}
	
	public boolean isEmpty() {
		return containers.isEmpty();
	}
	
	public String toString() {
		return String.format("<ContainerShip: %s, carrying %d containers>", name, containers.size());
	}
}

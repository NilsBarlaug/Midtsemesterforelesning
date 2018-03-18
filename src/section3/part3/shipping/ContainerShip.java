package section3.part3.shipping;

import java.util.ArrayList;
import java.util.List;

public class ContainerShip {
	private final String name;
	private final int containerCapacity;
	private final double weightCapacity;
	private List<IntermodalContainer> containers = new ArrayList<>();
	
	public ContainerShip(String name, int containerCapacity, double weightCapacity) {
		this.name = name;
		this.containerCapacity = containerCapacity;
		this.weightCapacity = weightCapacity;
	}
	
	public void loadContainers(List<IntermodalContainer> containersToBeLoaded) {
		if(this.containers.size() + containersToBeLoaded.size() > containerCapacity) {
			throw new IllegalArgumentException("Exceeding container capacity");
		}
		double newWeight = getTotalWeightLoad();
		for(IntermodalContainer container : containersToBeLoaded) {
			newWeight += container.getTotalWeight();
		}
		if(newWeight > weightCapacity) {
			throw new IllegalArgumentException("Exceeding weight capacity");
		}
		
		this.containers.addAll(containersToBeLoaded);
	}
	
	public List<IntermodalContainer> unloadContainers() {
		List<IntermodalContainer> unloadedContainers = new ArrayList<>(containers);
		containers.clear();
		return unloadedContainers;
	}
	
	public double getTotalWeightLoad() {
		double weight = 0;
		for(IntermodalContainer container : containers) {
			weight += container.getTotalWeight();
		}
		return weight;
	}
	
	public boolean isEmpty() {
		return containers.isEmpty();
	}
	
	public String toString() {
		return "<ContainerShip: " + name + ", carrying " + containers.size() + " containers>";
	}
}

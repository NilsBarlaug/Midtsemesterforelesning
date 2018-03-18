package section3.part3.shipping;

import java.util.ArrayList;
import java.util.List;

public class MaritimeContainerTerminal {
	private final String name;
	private List<IntermodalContainer> containers = new ArrayList<>();
	private List<ContainerShip> ships = new ArrayList<>();
	private List<MaritimeContainerTerminal> routes = new ArrayList<>();
	
	public MaritimeContainerTerminal(String name) {
		this.name = name;
	}
	
	public void addShip(ContainerShip ship) {
		if(ships.contains(ship)) {
			throw new IllegalArgumentException("Ship already added");
		}
		ships.add(ship);
	}
	
	public void addRoute(MaritimeContainerTerminal otherTerminal) {
		if(this.routes.contains(otherTerminal)) {
			throw new IllegalArgumentException("This route already exists");
		}
		this.routes.add(otherTerminal);
		otherTerminal.routes.add(this);
	}
	
	public void deliverContainers(List<IntermodalContainer> newContainers) {
		for(IntermodalContainer newContainer : newContainers) {
			if(containers.contains(newContainer)) {
				throw new IllegalArgumentException("Some container is already at the port");
			}
		}
		containers.addAll(newContainers);
	}
	
	public void pickUpContainers(List<IntermodalContainer> containersToBePickedUp) {
		if(!containers.containsAll(containersToBePickedUp)) {
			throw new IllegalArgumentException("These containers are not at this port");
		}
		containers.removeAll(containersToBePickedUp);
	}
	
	public void loadShip(ContainerShip ship, List<IntermodalContainer> containersToBeLoaded) {
		if(!ships.contains(ship)) {
			throw new IllegalArgumentException("The is ship is not at this port");
		}
		if(!this.containers.containsAll(containersToBeLoaded)) {
			throw new IllegalArgumentException("These containers are not at this port");
		}
		containers.removeAll(containersToBeLoaded);
		ship.loadContainers(containersToBeLoaded);
	}
	
	public void unloadShip(ContainerShip ship) {
		if(!ships.contains(ship)) {
			throw new IllegalArgumentException("The is ship is not at this port");
		}
		containers.addAll(ship.unloadContainers());
	}
	
	public void moveShip(ContainerShip ship, MaritimeContainerTerminal destination) {
		if(!routes.contains(destination)) {
			throw new IllegalArgumentException("No route to " + destination.name);
		}
		ships.remove(ship);
		destination.ships.add(ship);
	}

	public String toString() {
		return "<MaritimeTerminal: " + name + ", " + containers.size() + " containers, " + ships + ">";
	}
}

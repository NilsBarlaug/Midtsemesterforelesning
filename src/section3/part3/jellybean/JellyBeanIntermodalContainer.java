package section3.part3.jellybean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import section3.part3.shipping.IntermodalContainer;

public class JellyBeanIntermodalContainer implements IntermodalContainer {
	
	private static final double WEIGHT = 1000;
	private static final double BOX_CAPACITY = 3000;
	private List<JellyBeanBox> boxes = new ArrayList<>();
	
	public void addBox(JellyBeanBox box) {
		if(isFull()) {
			throw new IllegalStateException();
		}
		if(boxes.contains(box)) {
			throw new IllegalArgumentException();
		}
		boxes.add(box);
	}

	public List<JellyBeanBox> removeAllBoxes() {
		List<JellyBeanBox> removedBoxes = new ArrayList<>(boxes);
		boxes.clear();
		return removedBoxes;
	}
	
	public List<String> getAllFlavors() {
		Set<String> flavors = new HashSet<>();
		for(JellyBeanBox box : boxes) {
			flavors.add(box.getFlavor());
		}
		return new ArrayList<>(flavors);
	}
	
	public int getBeanCount() {
		int beanCount = 0;
		for(JellyBeanBox box : boxes) {
			beanCount += box.getBeanCount();
		}
		return beanCount;
	}
	
	public int getBeanCountForFlavor(String flavor) {
		int beanCount = 0;
		for(JellyBeanBox box : boxes) {
			if(box.getFlavor().equals(flavor)) {
				beanCount += box.getBeanCount();
			}
		}
		return beanCount;
	}
	
	public boolean isFull() {
		return boxes.size() >= BOX_CAPACITY;
	}
	
	public double getTotalWeight() {
		double totalWeight = WEIGHT;
		for(JellyBeanBox box : boxes) {
			totalWeight += box.getTotalWeight();
		}
		return totalWeight;
	}
	
	public String toString() {
		return String.format("<JellyBeanIntermodalContainer: %d boxes, %s>", boxes.size(), getAllFlavors());
	}

}

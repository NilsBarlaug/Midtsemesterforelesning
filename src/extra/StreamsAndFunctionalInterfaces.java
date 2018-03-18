package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAndFunctionalInterfaces {

	public static void main(String[] args) {
		JellyBeanBox box1 = new JellyBeanBox("Wicked watermelon");
		box1.addBeans(500);
		JellyBeanBox box2 = new JellyBeanBox("Cotton candy");
		box2.addBeans(1000);
		JellyBeanBox box3 = new JellyBeanBox("Wicked watermelon");
		box3.addBeans(1000);
		List<JellyBeanBox> boxes = new ArrayList<>();
		boxes.add(box1);
		boxes.add(box2);
		boxes.add(box3);
		
		List<JellyBeanBox> fullBoxes = boxes.stream()
				.filter(new JellyBeanBoxIsFull())
				.collect(Collectors.toList());
		System.out.println(fullBoxes);
		fullBoxes = boxes.stream()
				.filter(box -> box.getBeanCount() == box.getCapacity())
				.collect(Collectors.toList());
		System.out.println(fullBoxes);
		
		List<String> flavorsSorted = boxes.stream()
				.map(JellyBeanBox::getFlavor)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(flavorsSorted);
	}

}

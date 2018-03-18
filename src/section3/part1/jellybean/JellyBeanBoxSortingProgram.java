package section3.part1.jellybean;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JellyBeanBoxSortingProgram {

	public static void main(String[] args) {
		JellyBeanBox box1 = new JellyBeanBox("Super strawberry");
		box1.addBeans(300);
		JellyBeanBox box2 = new JellyBeanBox("Wicked watermelon");
		box2.addBeans(500);
		JellyBeanBox box3 = new JellyBeanBox("Wicked watermelon");
		box3.addBeans(100);
		JellyBeanBox box4 = new JellyBeanBox("Purple power");
		box4.addBeans(300);

		List<JellyBeanBox> boxes = Stream.of(box1, box2, box3, box4).collect(Collectors.toList());
		System.out.println(boxes);
		Collections.sort(boxes);
		System.out.println(boxes);
	}

}

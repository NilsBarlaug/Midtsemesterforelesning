package extra;

import java.util.function.Predicate;

public class JellyBeanBoxIsFull implements Predicate<JellyBeanBox> {

	public boolean test(JellyBeanBox box) {
		return box.getBeanCount() == box.getCapacity();
	}
	
}

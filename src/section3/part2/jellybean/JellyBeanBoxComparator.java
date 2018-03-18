package section3.part2.jellybean;

import java.util.Comparator;

public class JellyBeanBoxComparator implements Comparator<JellyBeanBox> {
	
	private boolean byFlavor;
	
	public JellyBeanBoxComparator(boolean byFlavor) {
		this.byFlavor = byFlavor;
	}

	public int compare(JellyBeanBox o1, JellyBeanBox o2) {
		if(byFlavor) {
			return compareFlavor(o1, o2);
		}
		else {
			return compareBeanCount(o1, o2);
		}
	}
	
	private int compareFlavor(JellyBeanBox o1, JellyBeanBox o2) {
		if(o1.getFlavor().equals(o2.getFlavor())) {
			return o1.getBeanCount() - o1.getBeanCount();
		}
		else {
			return o1.getFlavor().compareTo(o2.getFlavor());
		}
	}

	private int compareBeanCount(JellyBeanBox o1, JellyBeanBox o2) {
			if(o1.getBeanCount() == o2.getBeanCount()) {
				return o1.getFlavor().compareTo(o2.getFlavor());
			}
			else {
				return o1.getBeanCount() - o2.getBeanCount();
			}
	}
}

package section3.part3.icecream;

import section3.part3.shipping.IntermodalContainer;

public class IceCreamIntermodalContainer implements IntermodalContainer {
	
	private static final double WEIGHT = 1500;
	private static final double ICE_CREAM_WEIGHT_PER_VOLUME = 0.5;
	private static final double ICE_CREAM_CAPACITY = 5000;
	private double iceCreamVolume = 0;
	private double temperature;
	
	public IceCreamIntermodalContainer(double initialTemperature) {
		temperature = initialTemperature;
	}
	
	public void adjustTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void addIceCream(double volume) {
		if(volume < 0) {
			throw new IllegalArgumentException("Negative amount");
		}
		if(iceCreamVolume + volume > ICE_CREAM_CAPACITY) {
			throw new IllegalArgumentException("Exceeding ice cream capacity");
		}
		iceCreamVolume += volume;
	}
	
	public void removeIceCream(double volume) {
		if(volume < 0) {
			throw new IllegalArgumentException("Negative amount");
		}
		if(volume > iceCreamVolume) {
			throw new IllegalArgumentException("");
		}
		iceCreamVolume -= volume;
	}
	
	public double getIceCreamAmount() {
		return iceCreamVolume;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getTotalWeight() {
		return WEIGHT + ICE_CREAM_WEIGHT_PER_VOLUME * iceCreamVolume;
	}
	
	public String toString() {
		return String.format("<IceCreamIntermodalContainer: %.1fL, %.1f degrees>", iceCreamVolume, temperature);
	}

}

package section3.part3.icecream;

public class IceCreamIntermodalContainerProgram {
	public static void main(String[] args) {
		IceCreamIntermodalContainer container = new IceCreamIntermodalContainer(-10);
		container.addIceCream(1000);
		System.out.println(container);
		System.out.println(container.getTotalWeight());
	}

}

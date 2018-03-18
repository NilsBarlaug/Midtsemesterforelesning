package section1.part2.v2.jellybean;

public class JellyBeanCustomerProgram {
	public static void main(String[] args) {
		JellyBeanCustomer nils = new JellyBeanCustomer(1, "Nils");
		JellyBeanCustomer ole = new JellyBeanCustomer(2, "Ole");
		
		System.out.println(nils);
		System.out.println(ole);
		
		nils.orders.add(2000);
		nils.orders.add(600);
		ole.orders.add(50);
		ole.orders.add(50);
		ole.orders.add(80);
		
		System.out.println(nils);
		System.out.println(ole);
		
		System.out.println(nils.getTotalBeansOrdered());
		System.out.println(nils.getAverageBeansOrdered());
	}
}

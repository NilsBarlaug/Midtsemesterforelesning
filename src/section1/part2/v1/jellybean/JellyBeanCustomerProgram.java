package section1.part2.v1.jellybean;

public class JellyBeanCustomerProgram {
	public static void main(String[] args) {
		JellyBeanCustomer nils = new JellyBeanCustomer(1, "Nils");
		JellyBeanCustomer ole = new JellyBeanCustomer(2, "Ole");
		
		System.out.println(nils);
		System.out.println(ole);
		
		nils.orderBeans(2000);
		nils.orderBeans(600);
		ole.orderBeans(50);
		ole.orderBeans(50);
		ole.orderBeans(80);
		
		System.out.println(nils);
		System.out.println(ole);
		
		System.out.println(nils.getTotalBeansOrdered());
		System.out.println(nils.getAverageBeansOrdered());
	}
}

package section1.part3.jellybean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import section1.part3.jellybean.JellyBeanMachine;

public class JellyBeanMachineTest {
	
	private JellyBeanMachine machine;
	
	@Before
	public void setup() {
		machine = new JellyBeanMachine();
	}
	
	@Test
	public void testConstructor() {
		assertFalse(machine.isRunning());
		assertEquals(0, machine.getTotalBeansProduced());
		assertEquals(0, machine.getBeansProducedInCurrentRun());
	}

	@Test
	public void testIsRunning() {
		assertFalse(machine.isRunning());
		machine.start();
		assertTrue(machine.isRunning());
		machine.stop();
		assertFalse(machine.isRunning());
	}
	
	@Test
	public void testProduceBeans() {
		machine.start();
		machine.produceBeans(5);
		assertEquals(5, machine.getTotalBeansProduced());
		assertEquals(5, machine.getBeansProducedInCurrentRun());
		machine.produceBeans(10);
		assertEquals(15, machine.getTotalBeansProduced());
		assertEquals(15, machine.getBeansProducedInCurrentRun());
		machine.stop();
		assertEquals(15, machine.getTotalBeansProduced());
		assertEquals(15, machine.getBeansProducedInCurrentRun());
		machine.start();
		assertEquals(15, machine.getTotalBeansProduced());
		assertEquals(0, machine.getBeansProducedInCurrentRun());
		machine.produceBeans(20);
		assertEquals(35, machine.getTotalBeansProduced());
		assertEquals(20, machine.getBeansProducedInCurrentRun());
	}
	
	@Test(expected = IllegalStateException.class)
	public void testProduceWhenStopped() {
		machine.produceBeans(100);
	}

	/*@Test
	public void testProduceWhenStopped() {
		try {
			machine.produceBeans(100);
			fail();
		}
		catch(IllegalStateException e) {
		}
	}*/
	
	@Test(expected = IllegalArgumentException.class)
	public void testProduceBeansNegativeAmount() {
		machine.start();
		machine.produceBeans(-1);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testStartWhenRunning() {
		machine.start();
		machine.start();
	}
	
	@Test(expected = IllegalStateException.class)
	public void testStopWhenNotRunning() {
		machine.stop();
	}
	
}

























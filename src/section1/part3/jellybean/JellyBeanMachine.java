package section1.part3.jellybean;

public class JellyBeanMachine {
	private boolean running;
	private int totalBeansProduced;
	private int beansProducedInCurrentRun;
	
	public JellyBeanMachine() {
		running = false;
		totalBeansProduced = 0;
		beansProducedInCurrentRun = 0;
	}
	
	public void produceBeans(int amount) {
		if(amount < 0)
			throw new IllegalArgumentException("Can't produce a negative amount");
		
		if(!running)
			throw new IllegalStateException("Can't produce on an standby machine");
		
		totalBeansProduced += amount;
		beansProducedInCurrentRun += amount;
	}
	
	public void start() {
		if(running)
			throw new IllegalStateException("Already running.");
		
		running = true;
		beansProducedInCurrentRun = 0;
	}
	
	public void stop() {
		if(!running)
			throw new IllegalStateException("Not running.");
		
		running = false;
	}
	
	public boolean isRunning() {
		return running;
	}

	public int getTotalBeansProduced() {
		return totalBeansProduced;
	}

	public int getBeansProducedInCurrentRun() {
		return beansProducedInCurrentRun;
	}
	
}

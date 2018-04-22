package com.kartik.diningphilosopher;

public class DistinguishedWaiterSolution extends AbstractPhilosopher{
	
	private final DistinguishedWaiter distinguishedWaiter;

	protected DistinguishedWaiterSolution(DistinguishedWaiter distinguishedWaiter, String name) {
		super(name);
		
		if (distinguishedWaiter == null) {
			throw new IllegalArgumentException("Please pass the correct waiter \n");
		}
		
		this.distinguishedWaiter = distinguishedWaiter;
	}
	
	@Override
	public boolean attemptEat(Chopstick left, Chopstick right, Callback callback) {
		
		/**
		 * To check if there is any permit left for the waiter to give. If the permit is given
		 * then go ahead to pick the chopsticks
		 */
		
		if (distinguishedWaiter.acquireDistinguishedWaiter()) {
			if (left.pickChopstick()) {
				callback.pickedUpChopstick(left);
				
				if (right.pickChopstick()) {
					callback.pickedUpChopstick(right);
					
					return true;
				}
				
				callback.putDownChopstick(left);
				left.dropChopstick();
			}
		}
		
		distinguishedWaiter.releaseDistinguishedWaiter();
		return false;
	}

	@Override
	public void doneEating(Chopstick left, Chopstick right, Callback callback) {

		// Put the left chopstick down
		callback.putDownChopstick(left);
		left.dropChopstick();
		
		// Put the right chopstick down
		callback.putDownChopstick(right);
		right.dropChopstick();
		
//		distinguishedWaiter.releaseDistinguishedWaiter();
	}
	
	

}

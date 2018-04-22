package com.kartik.diningphilosopher;

/**
 * User: ksh326
 * Date: 04/13/15
 * Time: 12:20 PM
 */

public class DumbWaiterSolution extends AbstractPhilosopher{
	
	private final DumbWaiter dumbWaiter;
	
	public DumbWaiterSolution(DumbWaiter dumbWaiter, String name) {
		super(name);
		
		if (dumbWaiter == null) {
			throw new IllegalArgumentException("Please pass the correct waiter \n");
		}
		
		this.dumbWaiter = dumbWaiter;
	}

	@Override
	public boolean attemptEat(Chopstick left, Chopstick right, Callback callback) {
		
		// Try to acquire the lock
		if(dumbWaiter.acquireWaiter()) {
			callback.pickedUpChopstick(left);
			callback.pickedUpChopstick(right);
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public void doneEating(Chopstick left, Chopstick right, Callback callback) {
		
		// Put down the left and the right chopsticks
		callback.putDownChopstick(left);
		callback.putDownChopstick(right);
		
		// Release the lock
		dumbWaiter.releaseWaiter();
	}

}

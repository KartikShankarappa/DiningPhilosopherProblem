package com.kartik.diningphilosopher;

public class DijkstraSolution extends AbstractPhilosopher {

	protected DijkstraSolution(String name) {
		super(name);
	}

	
	/**
	 * This method returns true if the both the chopsticks are available for the philosopher 
	 * to start eating.
	 * It returns false if any of the lower or higher numbered chopstick is not available to eat
	 */
	@Override
	public boolean attemptEat(Chopstick left, Chopstick right, Callback callback) {
		
		Chopstick lowerChopstick;
		Chopstick higherChopstick;		
		
		/*
		 * This block of code is to find out which one should be the lower chopstick and which
		 * one should be the higher chopstick
		 */
		if (left.getNumberAroundTable() < right.getNumberAroundTable()) {
			lowerChopstick = left;
		}
		else {
			lowerChopstick = right;
		}
		
		if (lowerChopstick == left) {
			higherChopstick = right;
		}
		else {
			higherChopstick = left;
		}
		
		/**
		 * As per the Dijkstra's solution, the lower numbered chopstick should be first picked
		 * and then the higher numbered chopstick.
		 * If the lower chopstick is picked and the higher is not able to be picked, then the 
		 * lower chopstick should be put down to the table and should be made available
		 * for other philosopher to pick it up
		 * 
		 */
		if (lowerChopstick.pickChopstick()) {
			callback.pickedUpChopstick(lowerChopstick);
			
			if (higherChopstick.pickChopstick()) {
				callback.pickedUpChopstick(higherChopstick);
				
				return true;
			}
			
			callback.putDownChopstick(lowerChopstick);
			lowerChopstick.dropChopstick();
		}
		
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
	}
	
	

}

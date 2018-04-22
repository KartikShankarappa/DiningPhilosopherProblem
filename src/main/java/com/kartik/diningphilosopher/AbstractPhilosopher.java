package com.kartik.diningphilosopher;

public abstract class AbstractPhilosopher implements Philosopher {
	
	public final String name;
	
	protected AbstractPhilosopher(String name) {
		
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException ("Please enter a valid name \n");
		}
		
		this.name = name;
	}
	
	/**
	 * A getter method to obtain the name of the Philosopher
	 * @return	name
	 */
	@Override
	public String getName() {
		return name;
	}

}

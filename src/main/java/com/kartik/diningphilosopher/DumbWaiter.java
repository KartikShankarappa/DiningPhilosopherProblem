package com.kartik.diningphilosopher;

import java.util.concurrent.Semaphore;

public class DumbWaiter {

    // TODO - implement
	
	private final Semaphore semaphore;
	
	public DumbWaiter() {
		this.semaphore = new Semaphore(1);
	}
	
	
	/**
	 * A method to acquire the semaphore
	 */
	public boolean acquireWaiter() {
		return semaphore.tryAcquire();
	}
	
	/**
	 * A method to release the semaphore
	 */
	public void releaseWaiter() {
		semaphore.release();
	}

}

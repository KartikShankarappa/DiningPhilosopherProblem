package com.kartik.diningphilosopher;

import java.util.concurrent.Semaphore;

public class DistinguishedWaiter {

    // TODO - implement
	
private final Semaphore semaphore;
	
	public DistinguishedWaiter() {
		this.semaphore = new Semaphore(1);
	}
	
	/**
	 * A method to acquire the semaphore
	 */
	public boolean acquireDistinguishedWaiter() {
		return semaphore.tryAcquire();
	}
	
	/**
	 * A method to release the semaphore
	 */
	public void releaseDistinguishedWaiter() {
		semaphore.release();
	}

}

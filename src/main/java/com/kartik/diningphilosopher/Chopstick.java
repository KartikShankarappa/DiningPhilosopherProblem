package com.kartik.diningphilosopher;

import java.util.concurrent.Semaphore;

public class Chopstick {

    // TODO - change if need be

    private final int numberAroundTable;
    private final Semaphore semaphore;

    public Chopstick(int numberAroundTable) {
    	
    	if (numberAroundTable <= 0) {
    		throw new IllegalArgumentException("Please assign positive numbers to chopsticks \n");
    	}
        this.numberAroundTable = numberAroundTable;
        this.semaphore = new Semaphore(1);
    }

    
    /**
     * A getter method to obtain the number that was assigned to the chopstick
     * @return	numberAroundTable
     */
    public int getNumberAroundTable() {
        return numberAroundTable;
    }
    
    
    /**
     * A method to tell if the chopstick is acquired or not
     * @return
     */
    public boolean pickChopstick() {
    	if (semaphore.tryAcquire()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    
    /**
     * A method to release the chopstick
     */
    public void dropChopstick() {
    	semaphore.release();
    }

}

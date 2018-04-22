package com.kartik.diningphilosopher;

public class PhilosopherFactory {

    public static Philosopher construct(final String name) {
        // TODO - return your implementation of Philosopher
        return new DijkstraSolution(name);
    }

    public static Philosopher constructWithDumbWaiter(final DumbWaiter dumbWaiter, final String name) {
        // TODO - return your implementation of Philosopher which uses the DumbWaiter
        return new DumbWaiterSolution(dumbWaiter, name);
    }

    public static Philosopher constructWithDistinguishedWaiter(final DistinguishedWaiter distinguishedWaiter, final String name) {
        // TODO - return your implementation of Philosopher which uses the Waiter
        return new DistinguishedWaiterSolution(distinguishedWaiter, name);
    }

    public static DumbWaiter constructWaiter() {
        // TODO - return a new DumbWaiter
        return new DumbWaiter();
    }

    public static DistinguishedWaiter constructDistinguishedWaiter() {
        // TODO - return a new DistinguishedWaiter
        return new DistinguishedWaiter();
    }

}

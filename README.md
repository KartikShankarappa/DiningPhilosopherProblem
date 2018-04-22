Three solutions to the Dining Philosophers Problem.  

One is Dijkstra’s solution, the second and third are the arbitrator solution (i.e., DumbWaiter and DistinguishedWaiter).
    - Each solution has a different implementation of [Philosopher](src/main/java/com/kartik/diningphilosopher/Philosopher.java)
    - Besides the three implementations of [Philosopher](src/main/java/com/kartik/diningphilosopher/Philosopher.java) the other classes are: 
    [Chopstick](src/main/java/com/kartik/diningphilosopher/Chopstick.java), [DumbWaiter](src/main/java/com/kartik/diningphilosopher/DumbWaiter.java), [DistinguishedWaiter](src/main/java/com/kartik/diningphilosopher/DistinguishedWaiter.java) and [PhilosopherFactory](src/main/java/com/kartik/diningphilosopher/PhilosopherFactory.java)
    - The difference between the two arbitrator solutions is that the "Dumb" solution only allows for one philosopher to eat at any one time.  The "Distinguished" solution allows for many philosophers to eat at the same time (still under the restrictions of a limited number of chopsticks).
    - To ensure the program works, you need to invoke the main class three times.  Once passing in no arguments (which will execute your Dijkstra solution), another passing in "waiter" (which will execute your DumbWaiter solution) and another passing in "distinguished" (which will execute your DistinguishedWaiter solution).
        - For each solution, when invoking the main class, ensure the program never stops.  The philosophers should eat infinitely.
        - The main class is [DiningPhilosophersProblem](src/main/java/com/kartik/diningphilosopher/DiningPhilosophersProblem.java)
        - Run the program for at least 5 minutes without fail for each type.

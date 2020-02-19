package activityStarterCode.basicClasses;

import java.util.Random;


/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int currentWalkValue;
    private int max;
    private int min;

    /**
     * Creates a new random walk starting with some initial value.
     * TODO: Adjust this constructor to take an initial value for the walk.
     */
    public RandomWalk(int walkValue, int inputMax, int inputMin) {
        rng = new Random();
        currentWalkValue = walkValue;
        max = inputMax;
        min = inputMin;
    }

    /**
     * TODO Complete me.
     * @return the current value for the random walk.
     */
    public int getValue() {
        return currentWalkValue;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * TODO: Complete me.
     * @return Updated value.
     */
    public int advanceValue() {

        if (rng.nextBoolean() && currentWalkValue < max){
            currentWalkValue +=1;
        }
        else if (currentWalkValue > min){
            currentWalkValue -=1;
        }
        return currentWalkValue;
    }
}


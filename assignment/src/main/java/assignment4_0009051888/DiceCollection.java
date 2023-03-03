package assignment4_0009051888;
import java.util.Arrays;

/**
 * A DiceCollection object holds a set of Die objects in an array.
 * The number of sides on each Die is specified by passing an array of integers
 * to the DiceCollection constructor.
 *
 *  @author Jovain Chisholm
 */
public class DiceCollection {
    private Die[] diceArray; // array to store Die objects

    /**
     * Constructor takes an array of integers specifying the number of sides
     * on each Die, and creates and stores the corresponding Die objects.
     */
    public DiceCollection(int[] sidesArray) {
        int numDice = sidesArray.length;
        diceArray = new Die[numDice];
        for (int i = 0; i < numDice; i++) {
            diceArray[i] = new Die(sidesArray[i]);
        }
    }

    /**
     * Rolls all the dice in the collection by calling the roll() method
     * on each Die object.
     */
    public void rollAllDice() {
        for (Die die : diceArray) {
            die.roll();
        }
    }

    /**
     * Returns the current sum of all the sides showing on the dice in the collection.
     */
    public int getCurrentTotal() {
        int currentTotal = 0;
        for (Die die : diceArray) {
            currentTotal += die.getCurrentSide();
        }
        return currentTotal;
    }

    /**
     * Returns the minimum possible sum of all the dice in the collection.
     */
    public int getMinimumPossibleTotal() {
        int minPossibleTotal = 0;
        for (Die die : diceArray) {
            minPossibleTotal += 1;
        }
        return minPossibleTotal;
    }

    /**
     * Returns the maximum possible sum of all the dice in the collection.
     */
    public int getMaximumPossibleTotal() {
        int maxPossibleTotal = 0;
        for (Die die : diceArray) {
            maxPossibleTotal += die.getNumSides();
        }
        return maxPossibleTotal;
    }

    /**
     * Rolls the entire collection of dice a specified number of times and returns a histogram of the possible sums.
     * @param numRolls The number of times to roll the collection of dice.
     * @return An integer array representing the histogram of the possible sums.
     */
    public int[] histogram(int numRolls) {
        int[] histogram = new int[getMaximumPossibleTotal() + 1];
        Arrays.fill(histogram, 0);
        for (int i = 0; i < numRolls; i++) {
            rollAllDice();
            histogram[getCurrentTotal()]++;
        }

        return histogram;
    }

    /**
     * Returns a string representation of the DiceCollection object, including
     * all the dice, the minimum possible roll, the maximum possible roll,
     * and the current total showing on the dice.
     */
    public String toString() {
        String str = "";
        for (Die die : diceArray) {
            str += die.toString() + "\n";
        }
        str += "Minimum possible total: " + getMinimumPossibleTotal() + "\n";
        str += "Maximum possible total: " + getMaximumPossibleTotal() + "\n";
        str += "Current total showing: " + getCurrentTotal();
        return str;
    }
}

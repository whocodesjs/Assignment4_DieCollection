package assignment4_0009051888;
import java.util.Random;

/**
 * Die class represents a die with an arbitrary number of sides
 *
 * @author Jovain Chisholm
 */
class Die {
        private final int numSides;
        private int currentSide;

        /**
         * Constructor for Die class
         *
         * @param numSides the number of sides on the die
         */
        public Die(int numSides) {
                this.numSides = numSides;
                this.currentSide = 1;
        }

        /**
         * @return the number of sides on the die
         */
        public int getNumSides() {
                return numSides;
        }

        /**
         * @return the current side of the die
         */
        public int getCurrentSide() {
                return currentSide;
        }

        /**
         * Rolls the die by generating a random integer from 1 to numSides
         * and setting current side to the generated integer.
         *
         * @return the current side of the die
         */
        public int roll() {
                currentSide = new Random().nextInt(numSides) + 1;
                return currentSide;
        }

        /**
         * Returns a string representation of the Die object.
         */
        public String toString() {
                return "Die with " + numSides + " sides showing " + currentSide;
        }
}

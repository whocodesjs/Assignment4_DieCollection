package assignment4_0009051888;
import java.util.Scanner;

/**
 * DiceRollHistogram class is a driver class that allows the user to roll a set of dice and view the histogram of the results.
 *
 *  @author Jovain Chisholm
 */

public class DiceRollHistogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        /**
         * @param numDice the number of dice in the collection
         * @param sidesArray an array of integers specifying the number of sides on each die
         */

        System.out.print("Enter number of dice: ");
        int numDice = scanner.nextInt();

        int[] sidesArray = new int[numDice];
        for (int i = 0; i < numDice; i++) {
            System.out.print("Enter number of sides for die " + (i+1) + ": ");
            sidesArray[i] = scanner.nextInt();
        }


        /**
         * @param diceCollection a DiceCollection object
         */

        DiceCollection diceCollection = new DiceCollection(sidesArray);

        // Prints DiceCollection object
        System.out.println("\nDiceCollection:\n" + diceCollection);



        /**
         * @param exit boolean variable to control main menu loop
         */

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Roll once");
            System.out.println("2. Roll 100,000 times");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Roll once and print result
                    diceCollection.rollAllDice();
                    System.out.println("\nResult of rolling once:\n" + diceCollection + "\n");
                    break;
                case 2:
                    // Roll 100000 times and print histogram
                    int[] histogram = diceCollection.histogram(100000);
                    System.out.println("\nHistogram of rolling 100,000 times:");

                    for (int i = 0; i < histogram.length; i++) {
                        if (histogram[i] != 0) {
                            System.out.println(i + ": " + histogram[i]);
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}

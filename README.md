# Assignment4_DieCollection

## Overview

This project demonstrates the use of arrays in object-oriented programming by modeling dice and collections of dice in Java. The project defines two main classes:

- **Die**: Represents a single die with any number of sides.
- **DieCollection**: Represents a collection (array) of dice and provides methods to work with multiple dice.

## Features

- **Custom Die Sides:** Create dice with any number of sides.
- **Rolling Dice:** Simulate rolling a single die or a collection of dice.
- **Collection Operations:** Add, remove, and sum the values of dice in a collection.
- **Easy to Extend:** The classes are structured for easy extension to other dice-related games or simulations.

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/whocodesjs/Assignment4_DieCollection.git
   cd Assignment4_DieCollection
   ```

2. Compile the Java files:
   ```bash
   javac *.java
   ```

3. Run the main class (update to your main class name if not `Main`):
   ```bash
   java Main
   ```

## Example Usage

```java
Die sixSided = new Die(6);
int result = sixSided.roll(); // Rolls the die

DieCollection dice = new DieCollection(5, 6); // 5 dice, each with 6 sides
int total = dice.rollAll(); // Rolls all dice and sums result
```

## Project Structure

- `Die.java` - Implementation of a single die.
- `DieCollection.java` - Implementation of a collection of dice.
- `Main.java` (if exists) - Example usage and tests.

## License

This project is for educational purposes.

---

Feel free to customize this README to suit the specifics of your project!
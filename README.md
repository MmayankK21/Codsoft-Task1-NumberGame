# Number Guessing Game

Welcome to the Number Guessing Game! This is a simple console-based game where you guess a randomly chosen number within a specified range. You have a limited number of attempts to guess the correct number.

## How to Play

1. **Choose a Range**:
   - Enter the minimum and maximum values for the range within which the random number will be chosen.

2. **Guess the Number**:
   - You have 10 attempts to guess the randomly chosen number. For each incorrect guess, you'll receive a hint whether the guess was too low or too high.

3. **Scoring**:
   - You start with 10 points for each round. For each incorrect guess, your score decreases by one.

4. **Play Again**:
   - After each round, you can choose to play again or end the game. Your total score is accumulated over multiple rounds.

## Game Flow

1. The game will prompt you to enter a minimum and maximum number for the range.
2. It will then generate a random number within that range.
3. You will have 10 attempts to guess the number.
4. After each guess, you'll be told whether your guess was too low, too high, or correct.
5. If you guess the number correctly, you'll see a congratulatory message and your score for the round.
6. If you run out of attempts, the correct number will be revealed.
7. You can then choose to play again or end the game.

## Example

```
========================================
  Welcome to the Number Guessing Game!
========================================

Enter the minimum number for the range: 1
Enter the maximum number for the range: 100

I have chosen a number from 1 to 100.
You have 10 attempts to guess it!

---- Attempt 1 ----
Enter your guess: 50

Incorrect guess.
Hint: Your guess was too low.

...

🎉 Congratulations! You guessed the correct number: 75!
Well done! Your score for this round is: 7

Would you like to play again? (Y/N): N

Thank you for playing! Your final score is: 7
==============================================
```

## Prerequisites

- Java JDK installed on your machine.

## Running the Game

1. Compile the Java code:

   ```sh
   javac Main.java
   ```

2. Run the compiled program:

   ```sh
   java Main
   ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## Author

- [Mayank Wadhwa](https://github.com/MmayankK21)

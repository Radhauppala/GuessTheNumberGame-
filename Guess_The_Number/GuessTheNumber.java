package Guess_The_Number;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// Create objects for random number generation and user input
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		// Generate a random number between 1 and 100
		int randomNumber = random.nextInt(100) + 1;
		int attempts = 0;
		final int maxAttempts = 7; // Limit the number of guesses
		boolean hasWon = false;
		
		System.out.println("Welcome to the Guess the Number Game!");
		System.out.println("I have selected a number between 1 and 100.");
		System.out.println("You hava " + maxAttempts + " attempts to guess it.");
		
		//Game Loop
		while(attempts < maxAttempts) {
			System.out.println("Enter your guess: ");
			int userGuess = scanner.nextInt();
			attempts++;
			
			if(userGuess == randomNumber) {
				hasWon = true;
				break;
			}
			else if(userGuess > randomNumber) {
				System.out.println("Too high! Try again.");
			}
			else {
				System.out.println("Too low! Try again.");
			}
			
			System.out.println("Attempts remaining: " + (maxAttempts - attempts));
		}
		
		// Display the result
		if(hasWon) {
			System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
		}
		else {
			System.out.println("Sorry, you've used all your attempts. The number was " + randomNumber +".");
		}
		
		System.out.println("Thank you for playing!");
		scanner.close();
	}

}

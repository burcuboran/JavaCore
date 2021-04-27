package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String args[]) {

		// try {

		Random rand = new Random();
		int generatedNum = rand.nextInt(100);

		int count = 0;

		Scanner scan = new Scanner(System.in);
		int guessedNum = -1;

		boolean correct = false;
		int score = 100;

		boolean playing = true;

		while (playing) {

			if (count >= 10) {
				generatedNum = rand.nextInt(100);
				count = 0;
				System.out.println("You could not guess it right in 10th attempts. Starting over again...");
			}

			System.out.println("Type a number between 1 and 100");

			guessedNum = scan.nextInt();
			count++;

			/*
			 * if(guessedNum<100 && guessedNum>0) { throw new NumberException;
			 * System.out.println("please type a number between 1 and 100!"); }
			 */

			if (generatedNum > guessedNum) {
				System.out.println("The number you have guessed is lower");

			} else if (generatedNum < guessedNum) {
				System.out.println("The number you have been guessed is higher");

			} else {
				System.out.println("Congrats, you won! The number is: " + generatedNum + " " + " Guessed correct in "
						+ count + " attempts.");
				score = score - (count * 5);
				count = 0;
				System.out.println("TOTAL SCORE: " + score);

				boolean isValidAnswer;
				do {
					System.out.print("Would you like to play again (yes/no)? ");
					String playAgain = scan.next().toUpperCase();
					isValidAnswer = playAgain.equals("YES") || playAgain.equals("NO");
					playing = playAgain.equals("YES");

					if (playing == true) {
						generatedNum = rand.nextInt(100);
						count = 0;
						score = 100;
					} else {
						System.out.println("See you next time");

					}

					if (!isValidAnswer) {
						System.out.println("Error: Please enter \"yes or no\"");

					}

				} while (!isValidAnswer);

			}

		}

	}

}

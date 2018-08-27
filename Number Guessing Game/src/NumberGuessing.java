import java.util.Scanner;

//sample text
//text sample
public class NumberGuessing
	{
		static Scanner userInput = new Scanner(System.in);	
		static int randomNumber;
		static double randomNum;
		static int userGuess;
		static String howManyTimes;
		static boolean guessing = true;
		static boolean playing = true;
		static int level =	0;
		static int amountOfGuesses = 1;

		
		public static void main(String[] args)
			{
				
				
				greetUser();
					do
					{
					chooseDifficulty();
					generateNumber();
						do
						{
						takeUserGuessing();
						}
						while(guessing);
					playAgain();
					}
					while(playing);
				System.out.println("Alright then, good day.");

			}
		
		private static void playAgain()
			{
				System.out.println("Would you like to play again?");
				Scanner userInput1 = new Scanner(System.in);
				String again = userInput1.nextLine();
				
				if(again.toLowerCase().equals("yes"))
					{
						guessing = true;
					}
				else if(again.toLowerCase().equals("no"))
					{
						playing = false;
					}
				
			}

		private static void takeUserGuessing()
			{
				int userGuess = userInput.nextInt();
				
				if(userGuess == randomNumber)
					{
						System.out.println("Wow, you got it right.");
						
						if(amountOfGuesses == 1)
							{
								howManyTimes = " try";
							}
						else
							{
								howManyTimes = " tries";
							}
						
						System.out.println("You got it right in " + amountOfGuesses + howManyTimes);
						guessing = false;
					}
				
				else if(userGuess < randomNumber)
					{
						System.out.println("Your guess is too low");
						amountOfGuesses += 1;
					}
				
				else if(userGuess > randomNumber)
					{
						System.out.println("Your guess is too high");
						amountOfGuesses += 1;
					}
				
			}

		private static void generateNumber()
			{
				randomNumber = (int)(Math.random()*level)+1;
				
			}

		private static void chooseDifficulty()
			{
				System.out.println("What difficulty would you like?");
				System.out.println("[1] Easy");
				System.out.println("[2] Medium");
				System.out.println("[3] Hard");
				System.out.println("[4] No way!");
				int difficulty = userInput.nextInt();
				
				
				if(difficulty == 1)
					{
						level = 10;
						System.out.println("You'll be guessing numbers from 1-10");
					}
				
				else if(difficulty == 2)
					{
						level = 100;
						System.out.println("You'll be guessing numbers from 1-100");
					}
				
				else if(difficulty == 3)
					{
						level = 1000;
						System.out.println("You'll be guessing numbers from 1-1000");
					}
				
				else if(difficulty == 4)
					{
						level = 100;
						System.out.println("You'll be guessing numbers from 1-10000");
					}
				

				System.out.println("Alright, let's start");
				
			}

		private static void greetUser()
			{
				System.out.println("Hello there, what's your name?");
				String name = userInput.nextLine();
				System.out.println("Hi " + name);
				
			}


	}

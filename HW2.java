//Homework 2 created by Rebecca Dummet
//Program: This program will determine the users number chosen that is between 0 and 100
//Date: February 11, 2019
import java.util.Scanner; // program needs class Scanner to get input from the keyboard

public class HW2 
{
	public static void main(String [] args)
	{ 
		int lowest = 0; //Initialize lowest to zero
		int highest = 100; //Initialize highest to one hundred
		boolean correctGuess = false; //Initialize a Boolean variable named correctGuess to determine if we have accomplished the correct guess to be false
		int guess = 0; //Initialize variable named guess that stores the number of guesses we have made to zero
		int findNumber; //Declare variable named findNumber that stores an initial guess
		int input; //Declare variable named input that stores the users input- this is an int
		Scanner scanner = new Scanner (System.in); //Initialize Scanner object

		System.out.print("Please Choose a number between 0 to 100"); //Prompt user to choose a number

		findNumber = 50; //Make a guess and store it
		guess = guess + 1; //Increment the value in the variable named guess that stores number of guesses

		System.out.println("Is this the correct number" + findNumber); //Present the guess to the user
		System.out.println("Enter 1 if this was a correct guess, 2 if your number is higher, and 3 if your number is lower."); //Present prompt to user (“Enter 1 if this was a correct guess, 2 if your number is higher, and 3 if your number is lower:”)
		input = scanner.nextInt(); //Use Scanner to grab the nextInt() the user types in something and then that is stored
		if (input == 1){//If the user has typed in a “1” 
			correctGuess = true;//Change the value of the Boolean variable named correctGuess to true.
			System.out.println("I guessed your number in the first try!");
		} 
		while (correctGuess == false)
		{int midpoint = (lowest + highest)/2;//Modify the range for the next guess
			guess = guess + 1; //Generate a new guess
			System.out.println("Is"+ midpoint + "your number");//Present user with guess
			System.out.println("Enter 1 if this was a correct guess, 2 if your number is higher, and 3 if your number is lower."); //Present prompt to user (“Enter 1 if this was a correct guess, your number is higher, and 3 if your number is lower.”)
			input = scanner.nextInt(); //Use Scanner to grab the nextInt() the user types in, and store it
			
			if (input == 1)
			{//If the user has typed in a “1”
				correctGuess = true; //Change the value of the Boolean variable named correctGuess to true
				System.out.println("I guess your number");
			}
				else if(input == 2){
					guess = guess + 1;
					highest = midpoint;
					}
					
					else if(input == 3){
						guess = guess + 1;
						lowest = midpoint;
						}
		}
		System.out.println("This is how many steps it took to guess your number:" + guess);
	}
}






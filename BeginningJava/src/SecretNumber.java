/*
Gokulan Anand
4/25/2019
Generate a secret random number between 1 and 100
Prompt the user for a guess
 */

import java.util.Scanner; //imports Scanner.
import java.util.Random; //imports the Random class.

public class SecretNumber {
    public static void main(String[] args){
        Random secret = new Random();   //creates new random.
        Scanner input = new Scanner(System.in);   //creates new scanner.
        System.out.println("I have a number between 1 and 100. Guess what it is:");   //what the scanner prints.

        int secretInt = secret.nextInt(101);   //creates the secret integer the random class generates. The "bound" creates the limit for the number. Doesn't include 101.

        for (int counter=0; counter<3; counter++){   //creates for loop that gives the user 3 tries to guess the number.
            int guess = input.nextInt();   //makes an integer for the number the user inputs.

            if (guess > 100 || guess < 1){   //since we asked for a number between 1 and 100, we put this excluding those numbers.
                System.out.println("Are you stupid? I asked for a number between 1 and 100. Retake kindergarten and try again.");
            }
            else if (guess==secretInt){   //what happens when the user guesses the number.
                System.out.println("Holy mackerel! You guessed it! You are invited to Gekyume's birthday bash!!");
            }
            else if (Math.abs(secretInt-guess)<=5){   //We use the absolute value function to get the positive difference. If the user is 5 or less numbers away, we print it.
                System.out.println("You are so close. Never give up on your dreams and try again!");
            }
            else if (counter==2 && guess!=secretInt){   //This is the ending message. Without it, the for loop would say "try again" even though there are no tries left. When counter is 2, it is the last try. The if says if it is the last try, and the user guessed wrong, print following message.
                System.out.println("You failed pretty badly. My secret number was " + secretInt + ", you absolute buffoon.");
            }
            else{   ///Message for when user is outside of the margin of error.
                System.out.println("You missed by a mile nerd! Like Joakim Noah's jump shot... Try again trashcan:");
            }
        }
    }
}

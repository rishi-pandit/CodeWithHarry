/* Create a class Game, which allows a user to play "Guess the Number" game once.

        Game should have the following methods:
        Constructor to generate the random number
        takeUserInput() to take a user input of number
        isCorrectNumber() to detect whether the number entered by the user is true
        getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!
         */

package com.company;

import java.util.Random;
import java.util.Scanner;

class game1{
    public int rand, guess,no_of_guesses=0;
    public game1()
    {
       Random rd = new Random();
       rand = rd.nextInt(100);
    }

    public void userInput(int num)
    {
        guess = num;
    }

    public boolean isCorrect()
    {
        if(rand>guess)
        {
            System.out.println("Have chosen a bigger number");
            no_of_guesses = no_of_guesses + 1;
            return false ;
        }
        else if(rand<guess)
        {
            System.out.println("Have chosen a bigger number");
            no_of_guesses = no_of_guesses + 1;
            return false;
        }
        else{
            System.out.println("correct guess");
            no_of_guesses = no_of_guesses + 1;

            System.out.println(" no of guesses are taken : " +no_of_guesses);
            return true;
        }
    }
}

public class CWH_43_Exercise3_practice {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner (System.in);
        game gm = new game();

        System.out.println("Guess a Number : ");
        gm.userInput(sc.nextInt());

        while(!gm.isCorrect())
        {
            System.out.println("guess a number : ");
            gm.userInput(sc.nextInt());
        }
    }
}

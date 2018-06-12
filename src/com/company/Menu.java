package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    //Menu to prompt user for Library Options
    public void startMenu() {


        System.out.println("What would you like to do?" +
                "\n1. Add a game to the Library" +
                "\n2. Remove a game from the Library" +
                "\n3. View what is currently in the Library" +
                "\n4. Check out a Game" +
                "\n5. Check in a Game" +
                "\n6. View checked out Games" +
                "\n7. Exit the program");

        try {
            switch (input.nextInt()) {
                case 1:
                    //Handles Adding a game to library
                    break;
                case 2:
                    //Handles Removing Game from the library
                    break;
                case 3:
                    //View all games in the library that are available
                    break;
                case 4:
                    //Handles checking out a game from the Library
                    break;
                case 5:
                    //Handles checking a game back into the Library
                    break;
                case 6:
                    //View all games that have been previously checked out
                    break;
                case 7:
                    //Handles exiting the program
                    System.exit(0);
                    break;
                default:
                    //Starts menu options again
                    System.out.println("Please choose a number between 1 and 7");
                    startMenu();
                    break;


            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("That was not a valid entry. Please enter a number from 1 to 7.");
            startMenu();
        }
    }

}

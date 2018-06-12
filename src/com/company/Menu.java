package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Library library = new Library(this);



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
                    input.nextLine();
                    library.addGame();
                    break;
                case 2:
                    input.nextLine();
                    //Handles Removing Game from the library
                    System.out.println("Choose which game you would like to remove.");
                    library.listGamesInLibrary("forRemoval");
                    library.removeGame(input.nextInt() - 1);
                    break;
                case 3:
                    input.nextLine();
                    //View all games in the library that are available
                    library.listGamesInLibrary("inLibrary");
                    break;
                case 4:
                    //Handles checking out a game from the Library
                    input.nextLine();
                    System.out.println("You have chose to check out a game" +
                            "\nHere is a list of all games available to check out: ");
                    library.listGamesInLibrary("checkOut");
                    System.out.println("Choose a number for the game that you would like: ");
                    library.checkOutGame(input.nextInt() - 1);
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
        } catch(IndexOutOfBoundsException ioobe) {
            input.nextLine();
            System.out.println("You have not entered a correct number. Taking you back to the main menu.");
            startMenu();
        }
    }

}

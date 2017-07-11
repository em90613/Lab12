import java.util.Scanner;

/**
 * Created by ericm on 7/10/2017.
 */
public class RoshamboApp {


    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);
        String repeat;
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println();
        int compWins = 0;
        int userWins = 0;

        System.out.println("What's your name?");
        HumanPlayer name = new HumanPlayer();
        String userName = name.getName();


            System.out.println("Would you like to play against Player1 or Player2? (P1/P2)");
            String playerChoice = scnr.nextLine();

            if( !playerChoice.equalsIgnoreCase("p1") && (!playerChoice.equalsIgnoreCase("p2"))) {
                System.out.println("Invalid input. Player 1 or Player 1: (P1/P2)");
                playerChoice = scnr.nextLine();
            }

            do {
            Player1 p1 = new Player1();
            Player2 p2 = new Player2();
            HumanPlayer p3 = new HumanPlayer();

            Roshambo userSelection = p3.generateRoshambo();
            Roshambo compSelection1 = p1.generateRoshambo();
            Roshambo compSelection2 = p2.generateRoshambo();

            if (playerChoice.equalsIgnoreCase("P1")) {
                System.out.println("Player 1: " + compSelection1);
                System.out.println(userName + ": " + userSelection);

                if (compSelection1.equals(userSelection)) {
                    System.out.println("Draw!");
                } else if (userSelection.toString().equalsIgnoreCase("Scissors")) {
                    System.out.println("Rock smashes Scissors! You Lose!");
                    compWins = compWins +1;
                } else if (userSelection.toString().equalsIgnoreCase("Paper")) {
                    System.out.println("Paper covers Rock! You win!");
                    userWins = userWins + 1;
                }
            }

            if (playerChoice.equalsIgnoreCase("P2")) {
                System.out.println("Player 2: " + compSelection2);
                System.out.println(userName + ": " + userSelection);

                if (userSelection.equals(compSelection2)) {
                    System.out.println("Draw!");
                } else if (userSelection.toString().equalsIgnoreCase("Scissors")) {
                    if (compSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " loses!");
                        compWins = compWins +1;
                    } else {
                        System.out.println(userName + " wins!");
                        userWins = userWins +1;
                    }
                } else if (userSelection.toString().equalsIgnoreCase("Paper")) {
                    if (compSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " wins!");
                        userWins = userWins +1;
                    } else {
                        System.out.println(userName + " loses!");
                        compWins = compWins +1;
                    }
                } else if (userSelection.toString().equalsIgnoreCase("Rock")) {
                    if (compSelection2.toString().equalsIgnoreCase("Scissors")) {
                        System.out.println(userName + " wins!");
                        userWins = userWins +1;
                    } else {
                        System.out.println(userName + " loses!");
                        compWins = compWins +1;
                    }
                }
            }
            System.out.println();
            System.out.print("Would you like to play again? Y/N: ");
            repeat = scnr.nextLine();
            System.out.println();

            //validation on input
            while (!repeat.equalsIgnoreCase("Y") && (!repeat.equalsIgnoreCase("N"))) {
                System.out.print("Invalid Input. Would you like to play again? Y/N: ");
                repeat = scnr.nextLine();
                System.out.println();
            }

        } while (repeat.equalsIgnoreCase("Y"));

        System.out.println(playerChoice + ": " + compWins + " wins.");
        System.out.println(userName + ": " + userWins + " wins.");
        System.out.println("Goodbye");
    }
}














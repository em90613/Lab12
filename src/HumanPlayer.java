import java.util.Scanner;

/**
 * Created by ericm on 7/10/2017.
 */
public class HumanPlayer extends Player {
    Scanner scnr = new Scanner(System.in);

    @Override
    public Roshambo generateRoshambo() {

            System.out.println("Rock, Paper, or Scissors: (R/P/S): ");
            String userInput = scnr.nextLine();
            Roshambo choice = null;

        while(!userInput.equalsIgnoreCase("r") && !userInput.equalsIgnoreCase("p") && !userInput.equalsIgnoreCase("s")){
            System.out.println("Invalid choice. R/P/S?");
            userInput = scnr.nextLine();
        }
           if (userInput.equalsIgnoreCase("r")) {
                choice = Roshambo.ROCK;
            } else if (userInput.equalsIgnoreCase("p")) {
                choice = Roshambo.PAPER;
            } else if (userInput.equalsIgnoreCase("s")) {
                choice = Roshambo.SCISSORS;
            }


            return choice;
        }
    }














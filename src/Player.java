import java.util.Scanner;

/**
 * Created by ericm on 7/10/2017.
 */
public abstract class Player {
    private String name;
    public Roshambo choice;

    public abstract Roshambo generateRoshambo ();

    public String getName(){
        Scanner scnr = new Scanner(System.in);
        name = scnr.next();
        return name;
    }
    public Roshambo getChoice() {
        return choice;
    }

}

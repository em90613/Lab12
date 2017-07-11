/**
 * Created by ericm on 7/10/2017.
 */
public class Player1 extends Player {//Player1 will always select Rock
    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}

/**
 * Created by ericm on 7/10/2017.
 */
public class Player2 extends Player {//Will randomly select either Rock, Paper, or Scissors.
    @Override
    public Roshambo generateRoshambo() {

        int randNum = (int) (Math.random() * 2);
        switch (randNum) {
            case 0:
                return Roshambo.ROCK;
            case 1:
                return Roshambo.PAPER;
            case 2:
                return Roshambo.SCISSORS;
            default:
                System.out.println("Something went wrong with switch logic");
                break;
        }
        return null;
    }
}

/**
 * Created by ericm on 7/10/2017.
 */
public enum Roshambo {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");

    private String someName;

    Roshambo(String someName) {
        this.someName = someName;
    }

    @Override
    public String toString() {


        return someName;
    }
}

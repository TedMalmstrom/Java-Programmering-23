package My_code.My_E.DiceGame.DiceGame;
import java.util.Random;

public class Die {
    private int sides;
    private int currentValue;
    private Random randomGenerator;

    public Die(int sides) {
        this.sides = sides;
        randomGenerator = new Random();
        roll();
    }

    public int getSides() {
        return sides;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void roll() {
        currentValue = randomGenerator.nextInt(sides) + 1;
    }
} 

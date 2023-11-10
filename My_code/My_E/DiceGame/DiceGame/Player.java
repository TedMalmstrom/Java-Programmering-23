package My_code.My_E.DiceGame.DiceGame;

public class Player {
    private String name;
    private int score;
    private Die die;

    public Player(String name, int numberOfSides) {
        this.name = name;
        this.die = new Die(numberOfSides);
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    public void increaseScore() {
        score++;
    }

    public int getDieValue() {
        return die.getCurrentValue();
    }

    public void rollDie() {
        die.roll();
    }
}

package My_code.My_E.DiceGame.DiceGame;
import java.util.Scanner;

class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Just to make the terminal look empty when I start the game.
        printEmptyLines(8);

        System.out.println("--------------- Dice Game ---------------");
        System.out.println("\nEnter your name...");
        String playerName = scanner.next();
        
        System.out.println("\nHow many sides on the die?");
        int numberOfSides = scanner.nextInt();
        
        System.out.println("\nHow many rounds?");
        int numberOfRounds = scanner.nextInt();
        
        Player player = new Player(playerName, numberOfSides);
        
        //Make terminal look empty again.
        printEmptyLines(8);

        System.out.println("---------------- Let's go! ---------------");
        System.out.println(); //Is it better to have a Sout for a empty line or just use \n on next Sout?

        System.out.println(player.getName() + " guess the value of the dice 1-" + numberOfSides + ".");

        for (int rounds = 1; rounds <= numberOfRounds; rounds++) {
            System.out.println("\n---------------- Round " + rounds + "! ----------------");

            //Prompting the player to enter their guess.
            int guess = scanner.nextInt();

            player.rollDie();
            int dieValue = player.getDieValue();

            //Printing the rolled die value.
            System.out.println("\nI " + "rolled a " + dieValue + "!");
            System.out.println();

            if (guess == dieValue) {
                player.increaseScore();
                System.out.println("Your guess is correct! +1 points for " + player.getName() + ".");
            }
            else {
                System.out.println(player.getName() + "'s " + "guess is wrong... no points for you!");
            }
        }

    //Printing the player's final score. Game over!
    System.out.println("\nGame Over! " + player.getName() + " scored " + player.getScore() + " points in " + numberOfRounds + " rounds.");
    System.out.println();

    scanner.close();
    }

    public static void printEmptyLines(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println();
        }
    }
}
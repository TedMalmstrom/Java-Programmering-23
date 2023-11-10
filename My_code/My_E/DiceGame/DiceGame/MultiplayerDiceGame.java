package My_code.My_E.DiceGame.DiceGame;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiplayerDiceGame {
    public static void main(String[] args) {

    }

    //Skall initialisera spelet genom att ta emot användarinput och skapa 
    //alla instanser som behövs, samt en lista av spelare som sedan returneras.
    private static ArrayList<Player> initialize(); {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players... ");
        int numberPlayers = scanner.nextInt();

        ArrayList<Player> players = new ArrayList<>();

        for (int i = 1; i <= numberPlayers; i++) {
            System.out.println("Enter player " + i + "'s name...");
            String playerName = scanner.next();

            System.out.println("Enter the number of dice for " + playerName + ": ");
            int numberOfSides = scanner.nextInt();
            
        }
    }
    
    //Skall ta emot en lista av spelare och spela färdigt en hel omgång. 
    //Den skall gå igenom listan av spelare, rulla varje spelares tärningar, 
    //och summera resultatet för varje omgång.
    private static void takeTurn(ArrayList<Player> players); {

    }

    //Tar emot en lista av spelare och skall returnera en lista med vinnare. 
    //En vinnare är man om man har mest poäng. Vi har en lista eftersom flera spelare 
    //kan vinna, då flera spelare kan ha samma poäng.
    private static ArrayList<Player> getWinners(ArrayList<Player> players); {

    }
}



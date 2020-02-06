import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayingCardGame {
    // En spelklass PlayingCardGame som använder minst en instans av PlayingCardDeck för att spela ett kortspel. PlayingCardGame ska innehålla/representera:
    //- Skapa en blandad kortlek som spelet ska använda sig av
    //- Kunna spela som en eller flera spelare (om spelet man valt att implementera spelas av flera spelare).
    //- Kunna vinna / förlora / få oavgjort i spelet. Med andra ord, man ska kunna spela ett kortspel. - Innehålla en meny som ger användaren följande alternativ:
    //▪Spela ett parti ▪Visa spelregler ▪Avsluta spelet

    CardDeck playingCardDeck;

    public void initializeGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What game do you want to play?");
        System.out.println("1. Blackjack");
        System.out.println("2. Exit game");
        if (scanner.nextLine().equals("1")) {
            new BlackJack().initializeBlackJack();
        } else System.exit(0);
    }
}

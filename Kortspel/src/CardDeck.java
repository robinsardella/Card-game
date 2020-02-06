import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    //En klass PlayingCardDeck som representerar en kortlek på 52 kort av typen PlayingCard. PlayingCardDeckska innehålla/representera:
    //- Minst en datastruktur för att lagra alla PlayingCard objekt. Tex Array, ArrayList, LinkedList, HashMap, etc.
    //- En metod som tar ut det översta/första kortet från PlayingCardDeck. Implementera på valfritt sätt vad som ska hända om kortleken är tom och man anropar metoden (ska den returnera null / false? Ska den kasta ett exception? etc).
    //- En metod för att lägga till ett kort underst/längst bak på PlayingCardDeck.

    List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameService {

    public static List<Card> createAndShuffleCardDeck () {
        List<Card> cards = new ArrayList<>();
        for (Value value : Value.values()) {
            for (Colour colour : Colour.values()) {
                cards.add(new Card(value, colour, false));
            }
        }
        Collections.shuffle(cards);
        return cards;
    }

    public static Card getTopCard(List<Card> playingCardDeck) {
        Card topCard = playingCardDeck.get(0);

        return topCard;
    }

    public static List<Card> addCard(List<Card> playingCardDeck, Card card) {
        playingCardDeck.add(card);
        return playingCardDeck;
    }

    /*public Card getTopCard() {
        return PlayingCardGame.createAndShuffleCardDeck().get(0);
    }

    public void addCardToDeck(Card card) {
        cards.add(card);
    }

     */

}

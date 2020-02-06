import java.util.*;

public class BlackJack {

    public void initializeBlackJack() {
        System.out.println("Welcome to black jack!");
        playGame();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        List<Card> currentCardDeck = CardGameService.createAndShuffleCardDeck();
        List<Card> cardsOnHand = new ArrayList<>();
        List<Card> cardsOfHouse = new ArrayList<>();
        boolean isPlaying = true;
        while (isPlaying == true) {
            int answer = 0;
            System.out.println("Do you want a new card? 1 = yes || 2 = no");
            answer = scanner.nextInt();
            if (answer == 1) {
                newCard(cardsOnHand, currentCardDeck);
                updateCardDeck(currentCardDeck);
            }
            if (answer == 2) {
                System.out.println("The cards of the house: ");
                while (sumOfHand(cardsOfHouse) <= 21 && sumOfHand(cardsOfHouse) < sumOfHand(cardsOnHand)) {
                    newCard(cardsOfHouse, currentCardDeck);
                    updateCardDeck(currentCardDeck);
                }
                if (sumOfHand(cardsOfHouse) >= sumOfHand(cardsOnHand) && sumOfHand(cardsOfHouse) <= 21
                ) {
                    System.out.println("The house wins!");
                } else  System.out.println("You win!");
                new PlayingCardGame().initializeGame();
            }
            if (sumOfHand(cardsOnHand) > 21) {
                System.out.println("You lost :( \n ------ \n ------ \n");
                new PlayingCardGame().initializeGame();
            }

        }

    }
    public static int sumOfHand (List < Card > cardsOnHand) {
        List<Integer> valueOfHand = new ArrayList<>();
        cardsOnHand.forEach(card -> valueOfHand.add(card.getValue().getNumericValue()));
        Integer sum = valueOfHand.stream().
                reduce(0, (a, b) -> a + b);
        return sum;
    }

    public static List<Card> newCard(List<Card> cardsOnHand, List<Card> currentCardDeck) {
        cardsOnHand.add(CardGameService.getTopCard(currentCardDeck));
        System.out.println("The value of the hand: " + sumOfHand(cardsOnHand) + "\n");
        cardsOnHand.forEach(str -> System.out.println(str.getValue() + " OF " + str.getColour()));
        System.out.println();
        return cardsOnHand;
    }

    public static List<Card> updateCardDeck(List<Card> currentCardDeck) {
        currentCardDeck.remove(0);
        return currentCardDeck;
    }

}

import java.util.Random;

public class Deck {
    Card[] cards;
    private int currentCard = 0;

    enum Suit {
        SPADES, CLUBS, HEARTS, DIAMONDS
    }

    enum Rank {
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
        EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
        int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    Deck() {
        cards = new Card[52];
        int counter = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[counter++] = new Card(suit, rank);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int rand = random.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }
    }

    public Card drawCard() {
        if (currentCard < cards.length) {
            return cards[currentCard++];
        }
        return null;
    }

    public String toString() {
        StringBuilder deckDetails = new StringBuilder();
        for (Card card : cards) {
            deckDetails.append(card).append("\n");
        }
        return deckDetails.toString();
    }
}





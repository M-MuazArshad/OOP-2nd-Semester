public class Card {
    private final Deck.Suit SUIT;
    private final Deck.Rank RANK;

    Card(Deck.Suit suit, Deck.Rank rank) {
        this.SUIT = suit;
        this.RANK = rank;
    }

    public Deck.Suit getSuit() {
        return SUIT;
    }

    public Deck.Rank getRank() {
        return RANK;
    }

    public String toString() {
        return String.format("%s of %s", RANK, SUIT);
    }
}
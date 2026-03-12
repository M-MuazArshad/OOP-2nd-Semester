class Player {
    String name;
    int score;
    Card currentCard;

    Player(String name) {
        this.name = name;
    }

    public void setCard(Card card) {
        currentCard = card;
    }

    public void addScore(int points) {
        score += points;
    }

    public Card getCard() {
        return currentCard;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return String.format("%8s Score: %d   Card: %s",name,score,currentCard);
    }
}

import java.util.ArrayList;

public class Player {
    public Card[] cards;
    private ArrayList<Card> hand;
    public String name;

    public Player(String name, int totalCards) {
        this.name = name;
        cards = new Card[totalCards];
    }

    public void addCard(Card c) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = c;
                return;
            }
        }
    }

    public void removeCard(Card c) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == c) {
                cards[i] = null;
                return;
            }
        }
    }

    public void getCardCount() {
        System.out.println(cards.length);
    }

    public String getPlayerName() {
        return name;
    }

    public int currentIndex = -1;

    public void nextCard() {
        int start = currentIndex;

        do {
            currentIndex++;

            if (currentIndex >= cards.length) {
                currentIndex = 0; // wrap around
            }

            if (cards[currentIndex] != null) {
                return; // found the next card
            }

        } while (currentIndex != start);
    }

    public Card getCurrentCard() {
        return cards[currentIndex];
    }


    public boolean hasWon() {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                return false;
            }
        }
        return true;
    }

}

import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> cards;
    
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                         "Jack", "Queen", "King", "Ace"};
        
        // TODO: Initialize the deck with all 52 cards
    }
    
    public void shuffle() {
        // TODO: Implement shuffle
    }
    
    public Card dealCard() {
        // TODO: Deal a card from the deck
        return null;
    }
}
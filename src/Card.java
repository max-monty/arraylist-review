import java.util.ArrayList;
import java.util.Random;

public class Card {
    private String suit;    // "Hearts", "Diamonds", "Clubs", "Spades"
    private String rank;    // "2" through "10", "Jack", "Queen", "King", "Ace"
    private int value;      // numeric value for game purposes
    
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    
    // Add getters, toString, and compare methods
    
}
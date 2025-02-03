import java.util.ArrayList;

public class Game {
    private Deck deck;
    private ArrayList<Hand> players;
    private int currentPlayer;
    
    public Game(int numPlayers) {
        // TODO: Initialize the deck
        // TODO: Create hands for each player
        // TODO: Set currentPlayer to 0
    }
    
    public void dealInitialCards(int cardsPerPlayer) {
        // TODO: Deal cards to each player's hand
    }
    
    public void playTurn() {
        // TODO: Implement basic turn logic
    }
    
    public boolean isGameOver() {
        // TODO: Implement win condition check
        return false;
    }
    
    public Hand getCurrentPlayerHand() {
        // TODO: Return the current player's hand
        return null;
    }
    
    public void nextPlayer() {
        // TODO: Update currentPlayer to next player
    }
    
    public String getGameState() {
        // TODO: Return a string representation of the current game state
        return "";
    }

    public static void main(String[] args) {
        Game game = new Game(4);
        game.dealInitialCards(5);
        game.playTurn();
        System.out.println(game.getGameState());
    }
}

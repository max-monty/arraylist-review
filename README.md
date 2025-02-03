# ArrayList Review - Card Game Project

This project provides practice with ArrayList operations through implementing a basic card game framework. You'll work with multiple classes that use ArrayLists to manage cards, hands, and game state.

## Project Structure

The project contains the following classes:
- `Card.java`: Represents a playing card with suit, rank, and value
- `Deck.java`: Manages a deck of 52 cards using an ArrayList
- `Hand.java`: Represents a player's hand of cards using an ArrayList
- `Game.java`: Controls game flow and player management

## Your Tasks

### 1. Complete the Card Class
- Add getters for suit, rank, and value
- Implement toString() method to display card information
- Add a compareTo method to compare cards by value

### 2. Complete the Deck Class
- Initialize the deck with all 52 cards in the constructor
- Implement the shuffle() method to randomize card order
- Complete the dealHand() method to remove and return a specified number of cards

### 3. Complete the Hand Class
- Implement addCard() to add a card to the hand
- Create a sortBySuit() method using selection sort
- Implement findCard() to search for a specific card in the hand

### 4. Complete the Game Class
- Initialize the game with a deck and player hands
- Implement dealing cards to players
- Create turn logic and game flow
- Track current player and game state

## Tips for Working with ArrayLists
- Remember that ArrayList indices start at 0
- Use size() to get the number of elements
- Use add() to append elements
- Use remove() to delete elements
- Use get() to access elements
- Consider using enhanced for loops for iteration

## Testing Your Implementation
1. Create a new game with 2-4 players
2. Deal cards to each player
3. Test your sorting and searching methods
4. Verify that game state is properly maintained
5. Ensure proper player rotation

## Extension Ideas
- Add scoring system
- Implement specific card game rules (e.g., Go Fish, Crazy Eights)
- Add card comparison methods
- Create methods to evaluate poker hands
- Add computer player logic

## Grading Criteria
- Correct implementation of ArrayList operations
- Proper encapsulation and method organization
- Code documentation and style
- Successful game functionality
- Creative extensions (optional)

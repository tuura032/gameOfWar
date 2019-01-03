package warFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	// A Container for a normal deck of playing cards
	public List<Card> deck = new ArrayList<Card>();
	
	// array of the four suits
	String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
	
	// creates an instance of a deck of playing cards
	public void createDeck() {
		// for loop that repeats 4 times - one for each suit
		for (String suit : suits) {
			// for loop that repeats 13 times (2-14) - once for each value
			for (int i = 2; i < 15; i++) {
				//create instance of new card createCard(value, name);
				Card card = new Card(i, suit);
				//add card to deck array
				addCardToDeck(card);
			}	
		}
	}
		
	
	// Adds a card to the deck
	private void addCardToDeck(Card card) {
		deck.add(card);
	}
	
	// shuffles the deck
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
	
	
	// return the first (top) card to whoever drew it
	public Card draw() {
		
		Card topCard = deck.get(0);
		deck.remove(0);
		return topCard;
		
	}
	
}

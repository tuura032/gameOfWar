package warFiles;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	// instantiate new player
	public Player(String name) {
		this.setScore(0);
		this.setName(name);
	}
	
	// Draw a card from desired deck
	public void draw(Deck deck) {
		Card topCard = deck.draw();
		hand.add(topCard);
	}
	
	// Describes all cards in a players hand
	public void describeHand() {
		for (Card card : hand) {
			card.describe();
		}
	}
	
	// Returns the top card from a players hand
	public Card flip() {
		Card flippedCard = hand.get(0);
		hand.remove(0);
		return flippedCard;
	}
	
	// Gives point to player that wins a hand
	public void incrementScore() {
		score++;
	}
	
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

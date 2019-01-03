package warFiles;


public class App {

		// create a new deck
		static Deck deck1 = new Deck();
		
		// create player1 and player2
		static Player player1 = new Player("Paul");
		static Player player2 = new Player("Rachel");
		
		
	public static void main(String[] args) {
		
		// put cards in deck
		deck1.createDeck();
		
		//shuffle deck
		deck1.shuffleDeck();
		
		// distribute cards
		dealCards(deck1);
		
		// start the game
		startGame(player1, player2);
		
		// declare winner
		finalScore(player1, player2);	
		
	}
	
	// deals cards to players
	public static void dealCards(Deck deck) {
		
		// Keep track of which player gets next card
		boolean giveCardToPlayer1 = true;
		
		for (int i = 0; i < 52; i++) {
			if (giveCardToPlayer1) {
				
				// give card to player1
				player1.draw(deck1);
				giveCardToPlayer1 = false;
			} else {
				
				// give card to player 2
				player2.draw(deck1);
				giveCardToPlayer1 = true;
			}	
		}
	}
	
	// Starts the game of War
	public static void startGame(Player player1, Player player2) {
		for (int j = 0; j < 26; j++) {
			Card p1Next = player1.flip();
			Card p2Next = player2.flip();
			
			if (p1Next.getValue() > p2Next.getValue()) {
				System.out.print("Point for p1. ");
				
				// returnDescription returns string, rather than an int
				System.out.println(p1Next.returnDescription() + " beats " + p2Next.returnDescription());
				player1.incrementScore();
			} else if (p1Next.getValue() < p2Next.getValue()) {
				System.out.print("Point for p2. ");
				System.out.println(p2Next.getValue() + " beats " + p1Next.getValue());
				player2.incrementScore();
			} else {
				System.out.print("Draw! ");
				System.out.println(p1Next.getValue() + " ties " + p2Next.getValue());
			}
		}
	}
	
	// print out the final score
	public static void finalScore(Player player1, Player player2) {
		System.out.println("----------Final Score--------");
		System.out.println("P1 score " + player1.getScore());
		System.out.println("P2 score " + player2.getScore());
		
		if (player1.getScore() == player2.getScore()) {
			System.out.println("Draw!");
		} else if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
	}
}

package finalProject;

public class App {

	public static void main(String[] args) {
		Player player1 = new Player("John");
		Player player2 = new Player("Mark");
		
		Deck gameDeck = new Deck();
		gameDeck.shuffleDeck();


		//dealing cards to players
		for(int i = 0; i < 52; i++) {
			Card tempCard = gameDeck.drawTopCard();

			
			if(i % 2 == 0) {
				player2.playerHand.add(tempCard);
			}
			else{
				player1.playerHand.add(tempCard);
			}
		
		}
	
		//playing game
		for(int j = 0; j < 26; j++) {
			Card player1Card = player1.flipTopCard();
			Card player2Card = player2.flipTopCard();
			
			System.out.println("Round # : " + (j + 1));
			System.out.println("Player 1 plays: " + player1Card.describeCard() + " and Player 2 plays: " + player2Card.describeCard());
			
			
			if(player1Card.getValue() > player2Card.getValue()) {
				System.out.println("Player 1 wins round # " + (j+ 1));
				player1.incrementScore();
			}
			else if(player2Card.getValue() > player1Card.getValue()) {
				System.out.println("Player 2 wins round # " + (j + 1));
				player2.incrementScore();
			}
			System.out.println("\n");
		}
		
		System.out.println("Player 1 scored: " + player1.score + " points");
		System.out.println("Player 2 scored: " + player2.score + " points");
		
		if(player1.score > player2.score) {
			System.out.println("Player 1 is the winner!");
		}
		else if(player2.score > player1.score) {
			System.out.println("Player 2 is the winner!");
		}
		else {
			System.out.println("The game was a tie!");
		}

	}
	

}





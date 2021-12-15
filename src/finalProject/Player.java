package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> playerHand = new ArrayList<Card>();
	int score;
	String playerName;
	
	//Constructor
	Player(String name){
		this.score = 0;
		this.playerName = name;
		
	}
	
	//describe method
	public void describePlayer() {
		System.out.println(playerName);
		System.out.println("\n");
		
		for(int i = 0; i < this.playerHand.size(); i++) {
			Card tempCard = this.playerHand.get(i);
			tempCard.describeCard();
		}
	}

	//flip card
	public Card flipTopCard(){
		Card topCard = this.playerHand.get(this.playerHand.size() - 1);
			this.playerHand.remove(this.playerHand.size() -1);
			
		return topCard;
	}
	
	//draw card
	public Card drawCardFromDeck() {
		Card newCard = this.playerHand.get(this.playerHand.size());
		
		return newCard;
	}
	
	//increment Score
	public void incrementScore() {
		this.score += 1;
	}
	
}

package finalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> deck = new ArrayList<>();
	
	List<String> suits = Arrays.asList("hearts", "diamonds", "spades", "clubs");
	List<String> values = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
	
	//constructor
	Deck(){
		for(int i = 0; i < suits.size(); i++) {
			for(int j = 0; j < values.size(); j++) {
				String tempSuit = suits.get(i);
				String tempVal = values.get(j);
				
				Card tempCard = new Card(tempVal, tempSuit, j);
				
				deck.add(tempCard);
			}
		}
		
	}
	
	//shuffle
	public List<Card> shuffleDeck(){
		Collections.shuffle(deck);
		
		return deck;
	}
	
	//draw card
	public Card drawTopCard(){
		
		Card topCard = deck.get(deck.size() - 1);
		deck.remove(deck.size() - 1);
		
		return topCard;
		
	}
	

	
}





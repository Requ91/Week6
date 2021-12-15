package finalProject;

public class Card {
	
	int value;
	String name;
	
	//constructor
	public Card(String tempVal, String tempSuit, int j) {
		this.value = j;
		this.name = tempVal + " of " + tempSuit;
	}


	//describe card
	public String describeCard() {
		return this.name;
	}
	
		
	
		
		//getters and setters which the directions said to include, but it didn't say I had to use them.
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setValue(int val) {
		this.value = val;
	}
	
	public void setName(String suit, String rank) {
		this.name = rank + " of " + suit;
	}
	

	
}



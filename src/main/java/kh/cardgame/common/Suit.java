package kh.cardgame.common;

/**
 * The suit of a card.
 * 
 * @author Kevin Hooke
 */
public enum Suit {
	
	SPADES("S"), CLUBS("C"), DIAMONDS("D"), HEARTS("H");
	
	Suit(String suitDisplay){
		this.display = suitDisplay;
	}
	
	String display;
	
	public String toString(){
		return this.display;
	}
}

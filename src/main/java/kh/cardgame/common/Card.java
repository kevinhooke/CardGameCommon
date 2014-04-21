package kh.cardgame.common;

/**
 * A single playing card.
 *  
 * @author Kevin Hooke
 */
public class Card {
	private Suit suit;
	private CardName name;
	private int value;
	
	public Card(Suit suit, CardName name, int value){
		this.suit = suit;
		this.name = name;
		this.value = value;
		
	}
	
	public String toString(){
		StringBuilder b = new StringBuilder();
		b.append(this.suit);
		b.append(" ");
		b.append(this.name);
		b.append("  value = ");
		b.append(this.value);
		return b.toString();
	}

	public Suit getSuit() {
		return suit;
	}

	public CardName getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
}

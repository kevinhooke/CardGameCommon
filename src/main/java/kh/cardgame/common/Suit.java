package kh.cardgame.common;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

/**
 * The suit of a card.
 * 
 * @author Kevin Hooke
 */
@DynamoDBDocument
public enum Suit {
	
	SPADES("\u2660"), CLUBS("\u2663"), DIAMONDS("\u2666"), HEARTS("\u2665");
	
	String display;
	
	Suit(String suitDisplay){
		this.display = suitDisplay;
	}
	
	public static Suit displayValueToSuit(String suitName) {
		Suit suit = null;
		
		switch(suitName) {
		
		case "\u2660":
			suit = Suit.SPADES;
			break;

		case "\u2663":
			suit = Suit.CLUBS;
			break;

		case "\u2666":
			suit = Suit.DIAMONDS;
			break;
	
		case "\u2665":
			suit = Suit.HEARTS;
			break;
		}
		return suit;
	}
	
	@DynamoDBAttribute(attributeName = "SuitName")
	public String toString(){
		return this.display;
	}
}

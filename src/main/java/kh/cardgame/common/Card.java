package kh.cardgame.common;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A single playing card.
 *  
 * @author Kevin Hooke
 */
@DynamoDBDocument
public class Card {

	private Suit suit;
	private CardName name;
	private int pointsValue;
	
	public Card() {
	}
	
	public Card(Suit suit, CardName name, int value){
		this.suit = suit;
		this.name = name;
		this.pointsValue = value;
	}

	public Card(String suit, String name, int pointsValue){
		this.suit = Suit.displayValueToSuit(suit);
		this.name = CardName.displayValueToSuit(name);
		this.pointsValue = pointsValue;
	}

	
	public Card(String suit, String name, int pointsValue, String valueName, String suitName){
		this.suit = Suit.valueOf(suit);
		this.name = CardName.valueOf(name);
		this.pointsValue = pointsValue;
	}

	
	public String toString(){
		StringBuilder b = new StringBuilder();		
		b.append(this.name.toString());
		b.append(this.suit);

		return b.toString();
	}

	public Suit getSuit() {
		return this.suit;
	}
	
	//@DynamoDBAttribute(attributeName = "valuename")
	@JsonIgnore
	public String getValueName() {
		return this.name.toString();
	}

	//@DynamoDBAttribute(attributeName = "suitname")
	@JsonIgnore
	public String getSuitName() {
		return this.suit.toString();
	}

	
	public CardName getName() {
		return this.name;
	}

	public int getPointsValue() {
		return this.pointsValue;
	}
}

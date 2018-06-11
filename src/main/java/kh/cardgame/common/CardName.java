package kh.cardgame.common;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

/**
 * Name of a card.
 * 
 * @author kevinhooke
 */
@DynamoDBDocument
public enum CardName {

	ace("Ace"),
	two("2"),
	three("3"),
	four("4"),
	five("5"),
	six("6"),
	seven("7"),
	eight("8"),
	nine("9"),
	ten("10"),
	jack("Jack"),
	queen("Queen"),
	king("King");
	
	CardName(String display){
		this.display = display;
	}
	
	private String display;
	
	public static CardName displayValueToSuit(String cardNameString) {
		CardName cardName = null;
		
		switch(cardNameString) {
		
			case "Ace":
				cardName = CardName.ace;
				break;
			
			case "2":
				cardName = CardName.two;
				break;
				
			case "3":
				cardName = CardName.three;
				break;
				
			case "4":
				cardName = CardName.four;
				break;
				
			case "5":
				cardName = CardName.five;
				break;
				
			case "6":
				cardName = CardName.six;
				break;
				
			case "7":
				cardName = CardName.seven;
				break;
				
			case "8":
				cardName = CardName.eight;
				break;
				
			case "9":
				cardName = CardName.nine;
				break;
				
			case "10":
				cardName = CardName.ten;
				break;
				
			case "Jack":
				cardName = CardName.jack;
				break;
				
			case "Queen":
				cardName = CardName.queen;
				break;
				
			case "King":
				cardName = CardName.king;
				break;
		}
		return cardName;
	}
	
	public String toString(){
		return this.display;
	}
	
}

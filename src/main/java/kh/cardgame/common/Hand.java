package kh.cardgame.common;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;

import kh.cardgame.blackjack.data.ListOfCardsToMapOfMapsConverter;

/**
 * A player's hand of cards.
 * 
 * @author Kevin Hooke
 */
@DynamoDBDocument
public class Hand {
	
	private List<Card> cards = new ArrayList<>();

	private String playState = "inplay"; // inplay, stick, bust
	
	@DynamoDBTypeConverted(converter = ListOfCardsToMapOfMapsConverter.class)
	public List<Card> getCards(){
		return this.cards;	
	}
	
	//TODO: close ticket for this one, mapper was missing for setter
	@DynamoDBTypeConverted(converter = ListOfCardsToMapOfMapsConverter.class)
	public void setCards(List<Card> cards){
		this.cards = cards;	
	}
	
	
	public void addToHand(Card card){
		this.cards.add(card);
	}

	public String printHand(){
		StringBuilder sb = new StringBuilder();
		for(Card card: this.cards){
			sb.append(card);
			sb.append(", ");
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	//TODO mapper is looking for ValueOfCardsInHand when unconverting
	// either need to exclude the set or set or both?
	@DynamoDBIgnore
	public int getValueOfCardsInHand(){
		int value = 0;
		for(Card card : this.cards){
			value += card.getPointsValue();
		}
		return value;
	}

	public String getPlayState() {
		return playState;
	}

	public void setPlayState(String playState) {
		this.playState = playState;
	}
}

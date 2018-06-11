package kh.cardgame.common;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
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
	
	@DynamoDBTypeConverted(converter = ListOfCardsToMapOfMapsConverter.class)
	public List<Card> getCards(){
	return this.cards;	
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
	
	public int getValueOfCardsInHand(){
		int value =0;
		for(Card card : this.cards){
			value += card.getPointsValue();
		}
		return value;
	}
}

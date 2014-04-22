package kh.cardgame.common;

import java.util.ArrayList;
import java.util.List;

/**
 * A player's hand of cards.
 * 
 * @author Kevin Hooke
 */
public class Hand {

	
	private List<Card> cards = new ArrayList<>();
	
	public void addToHand(Card card){
		this.cards.add(card);
	}

	public void printHand(){
		for(Card card: this.cards){
			System.out.println(card);
		}
		System.out.println("\n");
	}
	
	public int getValueOfCardsInHand(){
		int value =0;
		for(Card card : this.cards){
			value += card.getValue();
		}
		return value;
	}
}

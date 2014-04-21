package kh.cardgame.common;

import java.util.Random;

/**
 * The dealer in a card game.
 *  
 * @author Kevin Hooke
 */
public class Dealer {

	private Deck deck = new Deck();
	
	public Card deal(int count)
	{
		Random r = new Random();
		
		int nextCard = r.nextInt(deck.cardsLeftInDeck());
		Card card = this.deck.takeCard(nextCard);
		return card;
	}
	
}

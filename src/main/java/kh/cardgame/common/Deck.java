package kh.cardgame.common;

import java.util.ArrayList;
import java.util.List;

/**
 * A deck of cards.
 *  
 * @author Kevin Hooke
 */
public class Deck {

	private List<Card> deck = new ArrayList<>();
	
	public Deck()
	{
		this.deck.add(new Card(Suit.CLUBS, CardName.ace, 1));
		this.deck.add(new Card(Suit.CLUBS, CardName.two, 2));
		this.deck.add(new Card(Suit.CLUBS, CardName.three, 3));
		this.deck.add(new Card(Suit.CLUBS, CardName.four, 4));
		this.deck.add(new Card(Suit.CLUBS, CardName.five, 5));
		this.deck.add(new Card(Suit.CLUBS, CardName.six, 6));
		this.deck.add(new Card(Suit.CLUBS, CardName.seven, 7));
		this.deck.add(new Card(Suit.CLUBS, CardName.eight, 8));
		this.deck.add(new Card(Suit.CLUBS, CardName.nine, 9));
		this.deck.add(new Card(Suit.CLUBS, CardName.ten, 10));
		this.deck.add(new Card(Suit.CLUBS, CardName.jack, 10));
		this.deck.add(new Card(Suit.CLUBS, CardName.queen, 10));
		this.deck.add(new Card(Suit.CLUBS, CardName.king, 10));

		this.deck.add(new Card(Suit.SPADES, CardName.ace, 1));
		this.deck.add(new Card(Suit.SPADES, CardName.two, 2));
		this.deck.add(new Card(Suit.SPADES, CardName.three, 3));
		this.deck.add(new Card(Suit.SPADES, CardName.four, 4));
		this.deck.add(new Card(Suit.SPADES, CardName.five, 5));
		this.deck.add(new Card(Suit.SPADES, CardName.six, 6));
		this.deck.add(new Card(Suit.SPADES, CardName.seven, 7));
		this.deck.add(new Card(Suit.SPADES, CardName.eight, 8));
		this.deck.add(new Card(Suit.SPADES, CardName.nine, 9));
		this.deck.add(new Card(Suit.SPADES, CardName.ten, 10));
		this.deck.add(new Card(Suit.SPADES, CardName.jack, 10));
		this.deck.add(new Card(Suit.SPADES, CardName.queen, 10));
		this.deck.add(new Card(Suit.SPADES, CardName.king, 10));
		
		this.deck.add(new Card(Suit.DIAMONDS, CardName.ace, 1));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.two, 2));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.three, 3));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.four, 4));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.five, 5));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.six, 6));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.seven, 7));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.eight, 8));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.nine, 9));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.ten, 10));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.jack, 10));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.queen, 10));
		this.deck.add(new Card(Suit.DIAMONDS, CardName.king, 10));

		this.deck.add(new Card(Suit.HEARTS, CardName.ace, 1));
		this.deck.add(new Card(Suit.HEARTS, CardName.two, 2));
		this.deck.add(new Card(Suit.HEARTS, CardName.three, 3));
		this.deck.add(new Card(Suit.HEARTS, CardName.four, 4));
		this.deck.add(new Card(Suit.HEARTS, CardName.five, 5));
		this.deck.add(new Card(Suit.HEARTS, CardName.six, 6));
		this.deck.add(new Card(Suit.HEARTS, CardName.seven, 7));
		this.deck.add(new Card(Suit.HEARTS, CardName.eight, 8));
		this.deck.add(new Card(Suit.HEARTS, CardName.nine, 9));
		this.deck.add(new Card(Suit.HEARTS, CardName.ten, 10));
		this.deck.add(new Card(Suit.HEARTS, CardName.jack, 10));
		this.deck.add(new Card(Suit.HEARTS, CardName.queen, 10));
		this.deck.add(new Card(Suit.HEARTS, CardName.king, 10));


	}
	
	public int cardsLeftInDeck(){
		return this.deck.size();
	}
	
	public Card takeCard(int position){
		Card card = this.deck.remove(position);
		return card;
	}
}

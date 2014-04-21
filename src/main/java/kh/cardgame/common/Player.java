package kh.cardgame.common;

/**
 * Player in a card game.
 * 
 * @author Kevin Hooke
 */
public class Player {

	private PlayerType playerType;
	private String playerName;
	
	private Hand hand;
	
	public enum PlayerType{
		human,
		computer
	}
	
	public Player(PlayerType type, String name){
		this.playerType = type;
		this.hand = new Hand();
		this.playerName = name;
	}
	
	public void addToHand(Card card){
		this.hand.addToHand(card);
	}

	public Hand getHand() {
		return hand;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public String getPlayerName() {
		return playerName;
	}

}


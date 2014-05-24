package kh.cardgame.common;

/**
 * Name of a card.
 * 
 * @author Kevin Hooke
 */
public enum CardName {

	ace("A"),
	two("2"),
	three("3"),
	four("4"),
	five("5"),
	six("6"),
	seven("7"),
	eight("8"),
	nine("9"),
	ten("10"),
	jack("J"),
	queen("Q"),
	king("K");
	
	CardName(String display){
		this.display = display;
	}
	
	private String display;
	
	public String toString(){
		return this.display;
	}
	
}

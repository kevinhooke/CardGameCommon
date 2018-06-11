package kh.cardgame.blackjack.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import kh.cardgame.common.Card;
import kh.cardgame.common.Deck;

public class DeckToMapOfMapsConverter 
	implements DynamoDBTypeConverter<Map<String, Map<String, String>>, Deck> {

    @Override
    public Map<String, Map<String, String>> convert(Deck deck) {
    	Map<String, Map<String, String>> results = new HashMap<>();
        Map<String, Card> cardMap = deck.getDeck();
        
    	for(Card card : cardMap.values()) {
    		Map<String, String> cardAttributes = new HashMap<>();
    		cardAttributes.put("suitName", card.getSuitName());
    		cardAttributes.put("value", String.valueOf(card.getPointsValue()));
    		cardAttributes.put("cardName", card.getName().toString());
    		results.put(card.getValueName() + card.getSuitName(), cardAttributes);
    	}
    	
        return results;
    }

    @Override
    public Deck unconvert(Map<String, Map<String, String>> cardMap) {
    	List<Card> cards = new ArrayList<>();;
    	Deck deck = new Deck();
    	
    	Set<String> cardNames = cardMap.keySet();
    	
    	for(String cardName : cardNames) {
    		Map<String, String> cardAttributes = cardMap.get(cardName);
    		Card card = new Card(
    				cardAttributes.get("suitName"),
    				cardAttributes.get("cardName"),
    				Integer.parseInt(cardAttributes.get("value"))
    				);
    		deck.getDeck().put(card.toString(), card);
    	}
    	
    	return deck;
    }
}

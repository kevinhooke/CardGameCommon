package kh.cardgame.blackjack.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import kh.cardgame.common.Card;

public class ListOfCardsToMapOfMapsConverter 
	implements DynamoDBTypeConverter<Map<String, Map<String, String>>, List<Card>> {

    @Override
    public Map<String, Map<String, String>> convert(List<Card> deck) {
    	Map<String, Map<String, String>> results = new HashMap<>();;
        
    	for(Card card : deck) {
    		Map<String, String> cardAttributes = new HashMap<>();
    		cardAttributes.put("suitName", card.getSuitName());
    		cardAttributes.put("value", String.valueOf(card.getPointsValue()));
    		cardAttributes.put("cardName", card.getName().toString());
    		results.put(card.getValueName() + card.getSuitName(), cardAttributes);
    	}
    	
        return results;
    }

    @Override
    public List<Card> unconvert(Map<String, Map<String, String>> deck) {
    	List<Card> cards = new ArrayList<>();;

    	Set<String> cardNames = deck.keySet();
    	
    	for(String cardName : cardNames) {
    		Map<String, String> cardAttributes = deck.get(cardName);
    		Card card = new Card(
    				cardAttributes.get("suitName"),
    				cardAttributes.get("cardName"),
    				Integer.parseInt(cardAttributes.get("value"))
    				);
    		cards.add(card);
    	}
    	
    	return cards;
    }
}

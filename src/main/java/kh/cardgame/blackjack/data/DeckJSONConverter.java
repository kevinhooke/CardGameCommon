package kh.cardgame.blackjack.data;

import java.io.IOException;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import kh.cardgame.common.Card;

public class DeckJSONConverter implements DynamoDBTypeConverter<String, List<Card>> {

    @Override
    public String convert(List<Card> deck) {
    	String jsonString = null;
        //Jackson object mapper
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter writer = objectMapper.writerFor(new TypeReference<List<Card>>(){});
        try {
            jsonString = writer.writeValueAsString(deck);
        } catch (JsonProcessingException e) {
            //do something
        }
        return jsonString;
    }

    @Override
    public List<Card> unconvert(String objectString) {
    	List<Card> objects = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objects = objectMapper.readValue(objectString, new TypeReference<List<Card>>(){});
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objects;
    }
}

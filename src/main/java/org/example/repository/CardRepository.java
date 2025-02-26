package org.example.repository;

import org.springframework.stereotype.Repository;
import java.util.*;


@Repository
public class CardRepository {
    private final List<Card> cardList;
    private final Map<String, Card> cardMap;

    public CardRepository() {
        // Some example data
        Card card1 = new Card("1111111111111111", "111", "10/26");
        Card card2 = new Card("1111111111111112", "112", "11/26");
        Card card3 = new Card("1111111111111113", "113", "12/26");

        cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card3);
        cardList.add(card2);

        cardMap = new HashMap<>();
        cardMap.put(card1.number(), card1);
        cardMap.put(card2.number(), card2);
        cardMap.put(card3.number(), card3);
    }

    public Optional<Card> getCardByNumber(String number) {
        if (cardMap.containsKey(number)) {
            return Optional.of(cardMap.get(number));
        } else {
            return Optional.empty();
        }
    }

    public boolean isValidCard(String number, String cvc, String validTill) {
        if (cardMap.containsKey(number)) {
            return cardMap.get(number).cvc().equals(cvc) && cardMap.get(number).validTill().equals(validTill);
        }
        return false;
    }
}

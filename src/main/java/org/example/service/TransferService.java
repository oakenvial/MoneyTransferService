package org.example.service;

import org.example.exception.InvalidData;
import org.example.exception.NoSuchCardNumber;
import org.example.model.Post200Response;
import org.example.model.TransferPostRequest;
import org.example.repository.Card;
import org.example.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class TransferService {
    @Autowired
    CardRepository cardRepository;

    public ResponseEntity<Post200Response> transferPost(TransferPostRequest transferPostRequest) {
        Optional<Card> cardFrom = cardRepository.getCardByNumber(transferPostRequest.getCardFromNumber());
        if (cardFrom.isEmpty()) {
            throw new NoSuchCardNumber("Invalid card from. No such card number exists: " + transferPostRequest.getCardFromNumber());
        }

        Optional<Card> cardTo = cardRepository.getCardByNumber(transferPostRequest.getCardToNumber());
        if (cardTo.isEmpty()) {
            throw new NoSuchCardNumber("Invalid card to. No such card number exists: " + transferPostRequest.getCardToNumber());
        }

        if (!cardRepository.isValidCard(cardFrom.get().getNumber(), cardFrom.get().getCvc(), cardFrom.get().getValidTill())) {
            throw new InvalidData("Invalid card from data");
        }

        Post200Response response = new Post200Response();
        response.setOperationId("1");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
